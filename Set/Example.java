import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Example{
	public static void main(String argv[]){
		new Example().setExample();
	}
	
	public void setExample(){
		//定義資料型別
		Set<String> zoo = new HashSet<String>();
		zoo.add("Panda");
		zoo.add("Koala");
		
		//call size()
		System.out.println("ZooSet.size(): " + zoo.size());
		
		//call iterator()
		System.out.println("ZooSet.iterator(): " + printSet(zoo));
		
		//call add(value)
		zoo.add("Penguin");
		System.out.println("ZooSet.add(\"Penguin\"): " + printSet(zoo));
		
		//call contains(value)
		if(zoo.contains("Penguin")){
			System.out.println("ZooSet.contains(\"Penguin\"): " 
				+ "There are already penguins in the zoo.");
		}else{
			System.out.println("ZooSet.contains(\"Penguin\"): " 
				+ "There are no penguins in the zoo.");
		}
		
		//call remove(value)
		zoo.remove("Penguin");
		System.out.println("ZooSet.remove(\"Penguin\"): " + printSet(zoo));
	}
	
	public String printSet(Set<String> set){
		String result = "";
		/*
		* 取出Iterator(迭代器)
		* Iterator會走訪集合內所有資料
		* Iterator.hasNext()判斷是否還有值(true/false)
		* Iterator.next()如有值，回傳該筆資料
		*/
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			if(!result.isEmpty()){
				result += ", ";
			}
			
			result += iterator.next();
		}
		
		return result;
	}
}