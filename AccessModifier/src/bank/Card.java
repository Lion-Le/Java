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
	 * 針對隱私性較高的變數
	 * 例：(dafault)、private
	 * 另外撰寫公開(public)方法
	 * 供不同套件的子類別使用
	 */
	//Setter menoy method
	protected void setMoney(int money){
		// 等號左邊的this.money是指Card的money
		// 等號右邊的money是想修改的內容
		this.money = money;
	}
	
	//Getter menoy method
	protected int getMoney(){
		return money;
	}
	
	//Setter id method
	protected void setId(long id){
		// 等號左邊的this.id是指Card的id
		// 等號右邊的id是想修改的內容
		this.id = id;
	}
	
	//Getter id method
	protected long getId(){
		return id;
	}
}