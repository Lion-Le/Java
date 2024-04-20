import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	//執行緒陣列
    private final Worker[] threads;
    //等待執行的任務佇列
    private final BlockingQueue<Runnable> taskQueue;

    /*
     * 在ThreadPool中建立對應的執行緒數量(numThreads)
     * */
    public ThreadPool(int numThreads) {
        this.taskQueue = new LinkedBlockingQueue<>();
        this.threads = new Worker[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Worker();
            threads[i].start();
        }
    }

    /*
     * 將欲執行的任務(Task)以Runnable方式 
     * 放至於taskQueue中 
     * 等待執行緒取出及執行
     */
    public void submitTask(Runnable task) {
        try {
            taskQueue.put(task); // 將任務放至等待佇列中
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    
    // 對ThreadPool中的每個執行緒發出中斷訊號
    public void shutdown() {
        for (Worker worker : threads) {
            worker.shutdown(); 
        }
    }
    
    /*
     * 判斷taskQueue是否有尚未完成的任務 
	 *
     * @return 尚有任務未完成，回傳 true
     *         任務皆已執行完，回傳 false
     */
    public boolean hasUnfinishedTasks() {
        return !taskQueue.isEmpty();
    }

    private class Worker extends Thread {
    	private boolean shutdownFlag = false;
        public void run() {
            try {
            	// 檢核執行緒是否收到中斷訊號
                while (!shutdownFlag) {
                	// 等待1秒，如佇列中有任務，從中取出任務，超時回傳null
                    Runnable task = taskQueue.poll(1000, TimeUnit.MILLISECONDS); 
                    if(task!=null) {
                    	task.run(); // 執行任務
                    }
                }
                
                System.out.println(Thread.currentThread().getName() + " - shutdown.");
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
        }
        
        public void shutdown() {
        	this.shutdownFlag = true;
        }
    }

    public static void main(String[] args) {
    	//建立ThreadPool物件，並設定執行緒數量為5
        ThreadPool threadPool = new ThreadPool(5);

        for (int i = 0; i < 10; i++) {
            ThreadPool.RunnableExample task = threadPool.new RunnableExample();
            threadPool.submitTask(task); // 提交任務給ThreadPool
        }

        /*
         * 判斷是否有任務尚未執行完
         * 如有主執行緒(main thread)等待1秒後再次檢核
         */
        while(threadPool.hasUnfinishedTasks()) {
        	try {
				Thread.sleep(1000);
				System.out.println("Task running - main thread wait 1s.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
        // 對ThreadPool內所有執行緒發出中斷訊號
        threadPool.shutdown();
        System.out.println("main Thread send shutdown flag.");
    }
    
    class RunnableExample implements Runnable{
    	@Override
    	public void run() {
    		try {
    			// 隨機停等1-3秒 模擬任務執行
    			long executeMillis = (int) ((Math.random()+1) * 3) * 1000;
    			String threadName = Thread.currentThread().getName();
    	        System.out.println(threadName + " execute " + executeMillis + " millis.");
                Thread.sleep(executeMillis); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    	}
    }
}
