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
	 * �w�����p�ʸ������ܼ�
	 * �ҡG(dafault)�Bprivate
	 * �t�~���g���}(public)��k
	 * �Ѥ��P�M�󪺤l���O�ϥ�
	 */
	//Setter menoy method
	protected void setMoney(int money){
		// �������䪺this.money�O��Card��money
		// �����k�䪺money�O�Q�ק諸���e
		this.money = money;
	}
	
	//Getter menoy method
	protected int getMoney(){
		return money;
	}
	
	//Setter id method
	protected void setId(long id){
		// �������䪺this.id�O��Card��id
		// �����k�䪺id�O�Q�ק諸���e
		this.id = id;
	}
	
	//Getter id method
	protected long getId(){
		return id;
	}
}