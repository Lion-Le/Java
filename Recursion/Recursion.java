public class Recursion{
	public static void main(String argv[]){
		Recursion recursion = new Recursion();
		long n = 5;
		System.out.println(n + "! : " + recursion.factorial(n));
	}
	
	public long factorial(long n){
		if(n>1){
			return factorial(n-1) * n;
		}else{
			return 1;
		}
	}
}