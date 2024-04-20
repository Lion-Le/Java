import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	//������}�C
    private final Worker[] threads;
    //���ݰ��檺���Ȧ�C
    private final BlockingQueue<Runnable> taskQueue;

    /*
     * �bThreadPool���إ߹�����������ƶq(numThreads)
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
     * �N�����檺����(Task)�HRunnable�覡 
     * ��ܩ�taskQueue�� 
     * ���ݰ�������X�ΰ���
     */
    public void submitTask(Runnable task) {
        try {
            taskQueue.put(task); // �N���ȩ�ܵ��ݦ�C��
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    
    // ��ThreadPool�����C�Ӱ�����o�X���_�T��
    public void shutdown() {
        for (Worker worker : threads) {
            worker.shutdown(); 
        }
    }
    
    /*
     * �P�_taskQueue�O�_���|������������ 
	 *
     * @return �|�����ȥ������A�^�� true
     *         ���ȬҤw���槹�A�^�� false
     */
    public boolean hasUnfinishedTasks() {
        return !taskQueue.isEmpty();
    }

    private class Worker extends Thread {
    	private boolean shutdownFlag = false;
        public void run() {
            try {
            	// �ˮְ�����O�_���줤�_�T��
                while (!shutdownFlag) {
                	// ����1��A�p��C�������ȡA�q�����X���ȡA�W�ɦ^��null
                    Runnable task = taskQueue.poll(1000, TimeUnit.MILLISECONDS); 
                    if(task!=null) {
                    	task.run(); // �������
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
    	//�إ�ThreadPool����A�ó]�w������ƶq��5
        ThreadPool threadPool = new ThreadPool(5);

        for (int i = 0; i < 10; i++) {
            ThreadPool.RunnableExample task = threadPool.new RunnableExample();
            threadPool.submitTask(task); // ������ȵ�ThreadPool
        }

        /*
         * �P�_�O�_�����ȩ|�����槹
         * �p���D�����(main thread)����1���A���ˮ�
         */
        while(threadPool.hasUnfinishedTasks()) {
        	try {
				Thread.sleep(1000);
				System.out.println("Task running - main thread wait 1s.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        
        // ��ThreadPool���Ҧ�������o�X���_�T��
        threadPool.shutdown();
        System.out.println("main Thread send shutdown flag.");
    }
    
    class RunnableExample implements Runnable{
    	@Override
    	public void run() {
    		try {
    			// �H������1-3�� �������Ȱ���
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
