import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example{
	public static void main(String argv[]){
		new Example().sortExample();
	}
	
	public void sortExample(){
		List<String> list = new ArrayList<String>();
		list.add("Penguin");
		list.add("Panda");
		list.add("Koala");
		System.out.println("List���Ƨ�: " + list);
		
		Collections.sort(list);
		System.out.println("List�ɾ��Ƨ�: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List�����Ƨ�: " + list);
		
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(new Card(1l, "Panda", 1000));
		cardList.add(new Card(3l, "Koala", 500));
		cardList.add(new Card(2l, "Penguin", 500));
		System.out.println("\nCardList���Ƨ�:\n" + printList(cardList));
		
		Collections.sort(cardList, new Comparator<Card>(){
			@Override
			public int compare(Card a, Card b)
			{
				/*
				* �̧ǥH�U�W�h�Ƨ�
				* 1. Money(�ɾ�)
				* 2. Id(�ɾ�)
				*/
				if(a.getMoney() - b.getMoney() == 0){
					return a.getId().compareTo(b.getId());
				}else{
					return a.getMoney() - b.getMoney();	
				}
			}
		});
		System.out.println("\nCardList�ɾ�(Money�BId)�Ƨ�:\n" + printList(cardList));
	}
	
	public String printList(List<Card> cardList){
		String sortMsg = "";
		for(Card value : cardList){
			if(!sortMsg.isEmpty()){
				sortMsg += "\n, ";
			}		
			
			sortMsg += value;
		}
		
		return sortMsg;
	}
}

class Card{
	private Long id;
	private String name;
	private int money;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Card(Long id, String name, int money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
}