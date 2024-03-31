import java.lang.Thread;

public class Example{
	public static void main(String argv[]){
		HorseThread horseThreaed = new HorseThread();
		
		HorseRunnable horseRunnable = new HorseRunnable();
		Thread thread = new Thread(horseRunnable);
		
		horseThreaed.start();
		thread.start();
	}
}

class HorseThread extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println(getName() + " - " + i);
		}
	}
}

class HorseRunnable implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}


