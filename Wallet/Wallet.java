public class Wallet{
	public static void main(String argv[]){
		Card myCard = new Card();
		Card lionCard = new Card();
		myCard.id = 999999;
		myCard.money = 100;
		lionCard.id = 999998;
		lionCard.money = 5000;
		System.out.println("myCard �d���G" + myCard.id);
		System.out.println("myCard �d���l�B�G" + myCard.showMoney());
		System.out.println("lionCard �d���G" + lionCard.id);
		System.out.println("lionCard �d���l�B�G" + lionCard.showMoney());
	}
}

class Card{
	long id;
	int money;
	
	int showMoney(){
		return money;
	}
}