public class Example{
	public static void main(String argv[]){
		System.out.println("數值比較:");
		int score = 100;
		if(score == 100){
			System.out.println("滿分");
		}else if(score >= 60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		
		System.out.println("\nString比較(==):");
		String str = new String("Hi~");
		if(str == "Hi~"){
			System.out.println("Hi~");
		}else{
			System.out.println("Bye~");
		}
		
		System.out.println("\nString比較(equals()):");
		if(str.equals("Hi~")){
			System.out.println("Hi~");
		}else{
			System.out.println("Bye~");
		}
	}
}