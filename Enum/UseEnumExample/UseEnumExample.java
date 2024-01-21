public class UseEnumExample{
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
	private Gender gender;
	public User(String name, Gender gender){
		this.name = name;
		this.gender = gender;
	}
	
	public Gender getGender(){
		return gender;
	}
	
	public String getName(){
		return name;
	}
}

enum Gender{
	MALE, FEMALE
}