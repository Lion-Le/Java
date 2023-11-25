package bank;

public class Card{
	//公開的，所有類別皆可存取
	public String name = "UserName";
	
	//保護的，僅子類別可以存取
	protected int securityCode = 999;

	//預設，同套件內的類別皆可存取
	long id = 9999999l;
	
	//私有的，僅自身類別可存取，其餘類別皆不可
	private int money = 0;
	
	/*
	 * 針對隱私性較高的資源
	 * 另外撰寫方法供其他類別使用
	 * 並隱藏該資源的處理過程
	 */
	protected void setMoney(int money){
		this.money = money;
	}
	
	protected int getMoney(){
		return money;
	}
	
	protected void setId(long id){
		this.id = id;
	}
	
	protected long getId(){
		return id;
	}
}
