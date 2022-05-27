package Animals.com;
import Animals.com.Animal;
import Animals.com.Dog;
import Animals.com.AnimalSwitcher;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("mew-mew");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalSwitcher.sounds(dog);
        AnimalSwitcher.sounds(cat);
    }
}
