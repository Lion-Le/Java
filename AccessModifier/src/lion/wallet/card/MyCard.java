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
		//呼叫Card類別的getMoney()方法
		return super.getMoney();
	}
	
	public void setMoney(int money){
		//呼叫Card類別的setMoney(int money)方法
		super.setMoney(money);
	}
	
	public int getSecurityCode(){
		return this.securityCode;
	}
}