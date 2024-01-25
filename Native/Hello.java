public class Hello{
	static{
		System.loadLibrary("Hello");
	}
	
	public native String callC();
	
	public static void main(String argv[]){
		System.out.println("call native callC() Method: " +new Hello().callC());
	}
}