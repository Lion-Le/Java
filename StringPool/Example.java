public class Example{
	public static void main(String argv[]){
		//String Literal
		String str1 = "hi";
		String str2 = "hi";

		//new String Object
		String str3 = new String("hi");
		String str4 = new String("hi");

		System.out.println(str1 == str2); //ture
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //false
		
		//Immutable String
		String str5 = "Hi!";
		str5 = str5 + " Java";
		System.out.println(str5); //Hi! Java
		
		//intern() method
		String str6 = "hi~";
		String str7 = new String("hi~").intern();
		System.out.println(str6 == str7); //true
	}
}