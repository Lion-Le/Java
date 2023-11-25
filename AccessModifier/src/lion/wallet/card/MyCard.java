package lion.wallet.card;

import bank.*;

public class MyCard extends Card{	
	public MyCard(){
		name = "Lion";
		securityCode = 777;
		setId(9999998l);
	}
	
	public int getMoney(){
		return super.getMoney();
	}
	
	public void setMoney(int money){
		super.setMoney(money);
	}
	
	public int getSecurityCode(){
		return this.securityCode;
	}
}