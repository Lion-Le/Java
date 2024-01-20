//final Class
public final class Example{
	
	//final Variable
	public final static String NAME = "Lion";
	
	//final Method
	public final static String getName(){
		return NAME;
	}
	
	public static void main(String argv[]){
		System.out.println("Name: " + Example.getName());
	}
}