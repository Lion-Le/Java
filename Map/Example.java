import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Example{
	public static void main(String argv[]){
		new Example().mapExample();
	}
	
	public void mapExample(){
		//定義資料型別
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//call put(key, value)
		map.put(1,"Panda");
		System.out.println("Map.put(1, \"Panda\"): {" + printMap(map) + "}");
		map.put(2,"Koala");
		System.out.println("Map.put(2, \"Koala\"): {" + printMap(map) + "}");
		
		//Duplicate key
		map.put(2,"Penguin");
		System.out.println("Map.put(2, \"Penguin\"): {" + printMap(map) + "}");
		
		//call size()
		System.out.println("\nMap.size(): " + map.size());
		
		//call containsKey(key)/containsValue(value)
		System.out.println("\nMap.containsKey(1): " + map.containsKey(1));
		System.out.println("Map.containsValue(\"Penguin\"): " + map.containsValue("Penguin"));
		
		//call get(key)
		System.out.println("\nMap.get(2): " + map.get(2));
		
		//call keySet()
		Set<Integer> keySet = map.keySet();
		String keys = "";
		for(Integer key : keySet){
			if(!keys.isEmpty()){
				keys += ", ";
			}		
			
			keys += key;
		}
		System.out.println("\nMap.keySet(): " + keys);
		
		//call remove(key)
		map.remove(2);
		System.out.println("\nMap.remove(2): {" + printMap(map) + "}");
	}
	
	public String printMap(Map<Integer, String> map){
		String result = "";
		for(Integer key : map.keySet()){
			if(!result.isEmpty()){
				result += ", ";
			}		
			
			result += key + ":" + map.get(key);
		}
		
		return result;
	}
}