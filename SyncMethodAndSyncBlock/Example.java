abstract class Company{
	protected Object lock = new Object();
	protected int product = 0;
	protected abstract void addProduct(int num);
}

class CompanySyncMethod extends Company{
	/*
	 * 同一時間只會有一個執行緒執行addProduct方法
	 * 其餘執行緒會等待前面執行緒結束才進入addProduct方法
	 */
	@Override
	public synchronized void addProduct(int num){
		try{
			int currentProduct = product;
			Thread.sleep(1000);
			product = currentProduct + num;
			System.out.println("product: " + product);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class CompanySyncBlock extends Company{
	@Override
	public void addProduct(int num){
		/*
		 * 同一時間只會有一個執行緒存取lock物件
		 * 其餘執行緒會等待前面執行緒結束才存取lock物件
		 *
		 * 除建立一個Lock物件 
		 * 也可使用this關鍵字直接引用本身類別作為鎖
		 * 本身類別也是一個物件
		 * synchronized(this){...}
		 */
		synchronized(lock){
			try{
				int currentProduct = product;
				Thread.sleep(1000);
				product = currentProduct + num;
				System.out.println("product: " + product);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Staff extends Thread{
	public Company company;
	public Staff(Company company){
		this.company = company;
	}
	
	public void run(){
		//每人每日可製作20個產品
		for(int day=1;day<=3;day++){
			/*
			 * 用多型(Polymorphism)方式呼叫不同子類別的addProduct方法
			 */
			company.addProduct(20);
		}
	}
}

public class Example{
	public static void main(String argv[]){
		try{
			System.out.println("Sync Method");
			CompanySyncMethod companySyncMethod = new CompanySyncMethod();
			Staff a = new Staff(companySyncMethod);
			Staff b = new Staff(companySyncMethod);
			a.start();
			b.start();
			
			//等待Sync Method的執行緒(a、b)結束
			a.join();
			b.join();
			
			System.out.println("\nSync Block");
			CompanySyncBlock companySyncBlock = new CompanySyncBlock();
			Staff c = new Staff(companySyncBlock);
			Staff d = new Staff(companySyncBlock);
			c.start();
			d.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
