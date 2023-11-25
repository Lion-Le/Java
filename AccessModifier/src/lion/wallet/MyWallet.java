package lion.wallet;

import lion.wallet.card.*;

public class MyWallet{
	public static void main(String argv[]){
		MyCard lionCard = new MyCard();
		lionCard.setMoney(1000);
		
		System.out.println("Money: " + lionCard.getMoney());
		System.out.println("SecurityCode: " + lionCard.getSecurityCode());
		System.out.println("Name: " + lionCard.name);
	}
}