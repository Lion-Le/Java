package lion.wallet;

import lion.wallet.card.*;

public class MyWallet{
	public static void main(String argv[]){
		MyCard lionCard = new MyCard();
		lionCard.setMoney(1000);
		
		/* 
		 * �Y�L�~��MyCard�����O
		 * �ݨϥ�MyCard���Ѫ���k
		 * �~��s��private�B(dafault)�Bprotected���ܼ�
		 */
		System.out.println("Money: " + lionCard.getMoney());
		System.out.println("SecurityCode: " + lionCard.getSecurityCode());
		
		// �]��public���ܼƥi�����s��
		System.out.println("Name: " + lionCard.name);
	}
}