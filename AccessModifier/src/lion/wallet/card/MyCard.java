package lion.wallet.card;

import bank.*;

public class MyCard extends Card{	
	public MyCard(){
		name = "Lion";
		securityCode = 777;
		setId(9999998l);
	}
	
	/*
	 * 撰寫公開(public)方法
	 * 供無繼承MyCard的類別使用
	 */
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