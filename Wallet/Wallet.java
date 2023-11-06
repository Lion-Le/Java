public class Wallet{
	public static void main(String argv[]){
		Card myCard = new Card();
		Card lionCard = new Card();
		myCard.id = 999999;
		myCard.money = 100;
		lionCard.id = 999998;
		lionCard.money = 5000;
		System.out.println("myCard 卡號：" + myCard.id);
		System.out.println("myCard 卡片餘額：" + myCard.showMoney());
		System.out.println("lionCard 卡號：" + lionCard.id);
		System.out.println("lionCard 卡片餘額：" + lionCard.showMoney());
	}
}

class Card{
	long id;
	int money;
	
	int showMoney(){
		return money;
	}
}