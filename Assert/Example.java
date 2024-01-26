public class Example{
	public static void main(String argv[]){
		assert 1 > 0;
		System.out.println("斷言1通過");
		
		assert 1 < 0 : "斷言2不通過"; 
		System.out.println("斷言2通過");
	}
}