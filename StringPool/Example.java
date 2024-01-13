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
	}
}