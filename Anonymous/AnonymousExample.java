import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnonymousExample {
	public static void main(String[] args) {
		//get current date
		//before
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("current time: " + dtf.format(localDateTime));
		//after
		System.out.println("current time: " + DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));

		
		//thread pool submit task
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		//before
		RunnableExample runnableExample = new RunnableExample();
		threadPool.submit(runnableExample);
		//after
		threadPool.submit(new Runnable() {
			@Override
			public void run() {
				//...
			}
		});
		
		
		threadPool.shutdown();
	}
}
