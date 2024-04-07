class Company{
	private static int product = 0;
	public synchronized static void addProduct(int num){
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
class Staff extends Thread{
	public void run(){
		//�C�H�C��i�s�@20�Ӳ��~
		for(int day=1;day<=3;day++){
			Company.addProduct(20);
		}
	}
}

public class Example{
	public static void main(String argv[]){
		Staff a = new Staff();
		Staff b = new Staff();
		a.start();
		b.start();
	}
}
