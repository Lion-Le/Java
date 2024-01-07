class Card{
	private String id;
	private String name;
	
	public Card(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean equals(Object obj){
		if(obj == null || obj.getClass()!= this.getClass()){
			return false;
		}
		
		if(obj == this){
			return true;
		}
		
		Card card = (Card) obj;
		boolean isIdEqual = id.equals(card.getId());
		boolean isNameEqual = name.equals(card.getName());
		
		return isIdEqual && isNameEqual;
	}
	
	public int hashCode(){
		return 31 * id.hashCode() * name.hashCode();
	}
}

public class Example{
	public static void main(String argv[]){
		Card card1 = new Card("999999999", "myCard");
		Card card2 = new Card("999999999", "myCard");
		
		System.out.println("==: " + (card1 == card2));
		System.out.println("Equals(): " + card1.equals(card2));
		System.out.println("card1.HashCode(): " + card1.hashCode() 
			+ "\ncard2.HashCode(): " + card2.hashCode());
	}
}