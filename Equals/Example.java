public class Example{
	public static void main(String argv[]){
		System.out.println("�ƭȤ��:");
		int score = 100;
		if(score == 100){
			System.out.println("����");
		}else if(score >= 60){
			System.out.println("�ή�");
		}else{
			System.out.println("���ή�");
		}
		
		System.out.println("\nString���(==):");
		String str = new String("Hi~");
		if(str == "Hi~"){
			System.out.println("Hi~");
		}else{
			System.out.println("Bye~");
		}
		
		System.out.println("\nString���(equals()):");
		if(str.equals("Hi~")){
			System.out.println("Hi~");
		}else{
			System.out.println("Bye~");
		}
	}
}