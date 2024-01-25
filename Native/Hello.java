public class Hello{
	static{
		//載入C++產出的DLL檔
		System.loadLibrary("Hello");
	}
	
	//呼叫C++對應的Java_Hello_callC方法
	public native String callC();
	
	public static void main(String argv[]){
		System.out.println("call native callC() Method: " +new Hello().callC());
	}
}