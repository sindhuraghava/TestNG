package demo;

public class Dog extends Animal{
	public void animalSound() {
		System.out.println("animal is barking");
	}

	public static void main(String[] args) {
		Dog Obj = new Dog();
		Obj.animalSound();
		Obj.eat();
	}

}
