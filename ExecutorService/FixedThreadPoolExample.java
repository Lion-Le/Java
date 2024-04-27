import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExample {

	public static void main(String[] args) {
		//建立ThreadPool物件，Thread最大上限為3條
		System.out.println("main thread start - create FixedThreadPool(3)");
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		/*
		 * 提交9個任務予ThreadPool
		 * 每個任務將隨機停等1-3秒
		 */
		for(int i=0;i<9;i++) {
			fixedThreadPool.submit(new RunnableExample());
		}
		
		//停止接收新任務
		System.out.println("main thread - Call shutdown() to stop receiving tasks");
		fixedThreadPool.shutdown();
		
		try {
			/*
			 * 嘗試再次提交任務
			 * 因為已停止接收新任務
			 * 所以會拋出RejectedExecutionException
			 */
			System.out.println("main thread - Retry submitting task");
			fixedThreadPool.submit(new RunnableExample());
		}catch(RejectedExecutionException e) {
			e.printStackTrace();
		}
		
		//選擇[強制結束所有任務]或[等待所有任務執行結束]
		try {
			/*
			 * 強制結束所有任務
			 */			
			//fixedThreadPool.shutdownNow();
			
			/*
			 * 等待20秒所有任務執行結束
			 * 如超過20秒，則直接回傳當下結果
			 */
			System.out.println("main thread - wait 20s.");
			boolean isFinished = fixedThreadPool.awaitTermination(20, TimeUnit.SECONDS);
			System.out.println("main thread - All task is finished: " + isFinished);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread end");
	}
}
