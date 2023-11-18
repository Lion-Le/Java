interface Animal{
	public void sound();
	public void move();
}

abstract class TerrestrialAnimal implements Animal{
	/*
	 * �߻P��������(move)�Ҭ��]
	 * �G�w�q���a�ͪ�(TerrestrialAnimal)����H���O
	 * ��@����(move)����k
	*/
	public void move(){
		System.out.println("�]..");
	}
	
	/*
	 * �߻P�����s�n(sound)���P
	 * �w�q����H��k
	 * �Ѥl���O�ۦ��@
	 */
	public abstract void sound();
}

class Dog extends TerrestrialAnimal{
	public void sound(){
		System.out.println("�L~");
	}
}

class Cat extends TerrestrialAnimal{
	public void sound(){
		System.out.println("�p~");
	}
}

class Dolphin implements Animal{
	public void move(){
		System.out.println("��a..");
	}
	
	public void sound(){
		System.out.println("��~");
	}
}

public class Example{
	public static void main(String argv[]){
		System.out.println("Dog:");
		Dog dog = new Dog();
		dog.move();
		dog.sound();
		
		System.out.println("\nCat:");
		Cat cat = new Cat();
		cat.move();
		cat.sound();
		
		System.out.println("\nDolphin:");
		Dolphin dolphin = new Dolphin();
		dolphin.move();
		dolphin.sound();
	}	
}