package lion.wallet;

import lion.wallet.card.*;

public class MyWallet{
	public static void main(String argv[]){
		MyCard lionCard = new MyCard();
		lionCard.setMoney(1000);
		
		/* 
		 * 若無繼承MyCard的類別
		 * 需使用MyCard提供的方法
		 * 才能存取private、(dafault)、protected的變數
		 */
		System.out.println("Money: " + lionCard.getMoney());
		System.out.println("SecurityCode: " + lionCard.getSecurityCode());
		
		// 設為public的變數可直接存取
		System.out.println("Name: " + lionCard.name);
	}
}