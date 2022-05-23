package Animals.com;
import Animals.com.Animal;
import Animals.com.Dog;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("mew-mew");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.run();
        cat.makeSound();
        dog.run();
        dog.makeSound();
    }
}
