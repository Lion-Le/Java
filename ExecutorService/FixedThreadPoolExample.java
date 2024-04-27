import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExample {

	public static void main(String[] args) {
		//�إ�ThreadPool����AThread�̤j�W����3��
		System.out.println("main thread start - create FixedThreadPool(3)");
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		/*
		 * ����9�ӥ��Ȥ�ThreadPool
		 * �C�ӥ��ȱN�H������1-3��
		 */
		for(int i=0;i<9;i++) {
			fixedThreadPool.submit(new RunnableExample());
		}
		
		//������s����
		System.out.println("main thread - Call shutdown() to stop receiving tasks");
		fixedThreadPool.shutdown();
		
		try {
			/*
			 * ���զA���������
			 * �]���w������s����
			 * �ҥH�|�ߥXRejectedExecutionException
			 */
			System.out.println("main thread - Retry submitting task");
			fixedThreadPool.submit(new RunnableExample());
		}catch(RejectedExecutionException e) {
			e.printStackTrace();
		}
		
		//���[�j����Ҧ�����]��[���ݩҦ����Ȱ��浲��]
		try {
			/*
			 * �j����Ҧ�����
			 */			
			//fixedThreadPool.shutdownNow();
			
			/*
			 * ����20��Ҧ����Ȱ��浲��
			 * �p�W�L20��A�h�����^�Ƿ�U���G
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
