public class Example{
	public static void main(String argv[]){
		try{
			new ErrorExample();
		}catch(Exception e){
			//�̥~�hmain��k�Τ@�B�zException
			e.printStackTrace();
			System.out.println("�{���o�Ϳ��~");
		}
	}
}