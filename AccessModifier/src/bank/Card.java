package bank;

public class Card{
	//���}���A�Ҧ����O�ҥi�s��
	public String name = "UserName";
	
	//�O�@���A�Ȥl���O�i�H�s��
	protected int securityCode = 999;

	//�w�]�A�P�M�󤺪����O�ҥi�s��
	long id = 9999999l;
	
	//�p�����A�Ȧۨ����O�i�s���A��l���O�Ҥ��i
	private int money = 0;
	
	/*
	 * �w�����p�ʸ������귽
	 * �t�~���g��k�Ѩ�L���O�ϥ�
	 * �����øӸ귽���B�z�L�{
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
