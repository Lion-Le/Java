public class Example{
	public static void main(String argv[]){ 
		String str = "Hi!";
		if(StringUtil.equalsHi(str)){
			// ...
		}
		
		str = null;
		if(StringUtil.equalsHi(str)){
			// ...
		}
	}
}