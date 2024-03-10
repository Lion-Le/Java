import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Example{
	public static void main(String argv[]){
		new Example().setExample();
	}
	
	public void setExample(){
		//�w�q��ƫ��O
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
		* ���XIterator(���N��)
		* Iterator�|���X���X���Ҧ����
		* Iterator.hasNext()�P�_�O�_�٦���(true/false)
		* Iterator.next()�p���ȡA�^�Ǹӵ����
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