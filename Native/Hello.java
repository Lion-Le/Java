public class Hello{
	static{
		//���JC++���X��DLL��
		System.loadLibrary("Hello");
	}
	
	//�I�sC++������Java_Hello_callC��k
	public native String callC();
	
	public static void main(String argv[]){
		System.out.println("call native callC() Method: " +new Hello().callC());
	}
}