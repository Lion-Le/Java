public class RunnableExample implements Runnable{
	@Override
	public void run() {
		try {
			// �H������1-3�� �������Ȱ���
			long executeMillis = (int) ((Math.random()+1) * 3) * 1000;
			String threadName = Thread.currentThread().getName();
	        System.out.println(threadName + " execute " + executeMillis + " milliseconds.");
            Thread.sleep(executeMillis); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
