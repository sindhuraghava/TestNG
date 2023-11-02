package demo;

public class Dog2 implements IAnimal{
	
	public void animalSound() {
		System.out.println("bow boe");
	}
	public void eat(){
		System.out.println("eat eat");
	}
	public static void main(String[] args) {
		//implementing of interface
		Dog2 Obj = new Dog2();  // IAnimal 	Obj = new Dog2 other way to create 
		Obj.animalSound();
		Obj.eat();
		}

}
