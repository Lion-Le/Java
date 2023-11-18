interface Animal{
	public void sound();
	public void move();
}

abstract class TerrestrialAnimal implements Animal{
	/*
	 * 貓與狗的移動(move)皆為跑
	 * 故定義陸地生物(TerrestrialAnimal)的抽象類別
	 * 實作移動(move)的方法
	*/
	public void move(){
		System.out.println("跑..");
	}
	
	/*
	 * 貓與狗的叫聲(sound)不同
	 * 定義為抽象方法
	 * 由子類別自行實作
	 */
	public abstract void sound();
}

class Dog extends TerrestrialAnimal{
	public void sound(){
		System.out.println("汪~");
	}
}

class Cat extends TerrestrialAnimal{
	public void sound(){
		System.out.println("喵~");
	}
}

class Dolphin implements Animal{
	public void move(){
		System.out.println("游泳..");
	}
	
	public void sound(){
		System.out.println("啾~");
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