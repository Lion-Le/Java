import java.util.List;
import java.util.ArrayList;

public class Example{
	public static void main(String argv[]){
		new Example().listExample();
	}
	
	public void listExample(){
		List<String> zoo = new ArrayList<String>();
		zoo.add("Panda");
		zoo.add("Koala");
		System.out.println("ZooList: " + printList(zoo));
		
		//call size()
		System.out.println("ZooList.size(): " + zoo.size());
		
		//call add(index, value)
		zoo.add(1, "Penguin");
		System.out.println("ZooList.add(1, \"Penguin\"): " + printList(zoo));
		
		//call set(index, value)
		zoo.set(1, "Seal");
		System.out.println("ZooList.set(1, \"Seal\"): " + printList(zoo));
		
		//call remove(index)
		zoo.remove(1);
		System.out.println("ZooList.remove(1): " + printList(zoo));
	}
	
	public String printList(List<String> list){
		String result = "";
		for(int i=0;i<list.size();i++){
			if(!result.isEmpty()){
				result += ", ";
			}
			
			result += list.get(i)+"("+i+")";
		}
		
		return result;
	}

}