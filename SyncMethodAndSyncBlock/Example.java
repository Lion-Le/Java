abstract class Company{
	protected Object lock = new Object();
	protected int product = 0;
	protected abstract void addProduct(int num);
}

class CompanySyncMethod extends Company{
	/*
	 * �P�@�ɶ��u�|���@�Ӱ��������addProduct��k
	 * ��l������|���ݫe������������~�i�JaddProduct��k
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
		 * �P�@�ɶ��u�|���@�Ӱ�����s��lock����
		 * ��l������|���ݫe������������~�s��lock����
		 *
		 * ���إߤ@��Lock���� 
		 * �]�i�ϥ�this����r�����ޥΥ������O�@����
		 * �������O�]�O�@�Ӫ���
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
		//�C�H�C��i�s�@20�Ӳ��~
		for(int day=1;day<=3;day++){
			/*
			 * �Φh��(Polymorphism)�覡�I�s���P�l���O��addProduct��k
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
			
			//����Sync Method�������(a�Bb)����
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
