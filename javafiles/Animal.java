Abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    
    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping.");
		
    }
	public Animal()
	{
		System.out.println("const");
	}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Create a Dog object
        dog.makeSound();  // Calls the abstract method implementation
        dog.sleep();  // Calls the regular method
    }
}
}