public class NotUseEnumExample{
	public static void main(String argv[]){
		User user = new User("Lion", Gender.MALE);
		if(user.getGender().equals(Gender.MALE)){
			System.out.println(user.getName() + " is male.");
		}else if(user.getGender().equals(Gender.FEMALE)){
			System.out.println(user.getName() + " is female.");			
		}
	}
}

class User{
	private String name;
	private String gender;
	public User(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getName(){
		return name;
	}
}

class Gender{
	public final static String MALE = "male";
	public final static String FEMALE = "female";
}