public class GenericsExample<T> {
	public int getLength(String[] strArray) {
		return strArray.length;
	}
	
	public int getLength(Integer[] intArray) {
		return intArray.length;
	}
	
	public int getLength(T[] array) {
		return array.length;
	}
	
	//Multiple Bounded
	public <E extends Animal & GenericInterface<String>> int getLength(E[] array){
		return array.length;
	}
	
	public <K, V> void writeGeneric(K key, V value){
		//...
	}
	
	public static void main(String argv[]) {
		// Upper Bounded
		GenericsExample<? extends Animal> subGenerics = new GenericsExample<Cat>();
		//subGenerics = new GenericsExample<Cat>();		// O
		//subGenerics = new GenericsExample<String>();	// X
		
		// Lower Bounded
		GenericsExample<? super Cat> baseGenerics = new GenericsExample<Animal>();
		//baseGenerics = new GenericsExample<Animal>();	// O
		//baseGenerics = new GenericsExample<String>();	// X
		
		// for Multiple Bounded <E extends Animal & GenericInterface<String>>
		baseGenerics.getLength(new GenericImpl[5]);
	}
	
	public static class GenericImpl extends Animal implements GenericInterface<String>{
		//...
	}
	
	public interface GenericInterface<T>{
		//...
	}
}
