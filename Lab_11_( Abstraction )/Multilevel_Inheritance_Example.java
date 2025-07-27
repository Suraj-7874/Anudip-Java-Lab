
import java.util.Scanner;

class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
}

class Mammal extends Animal {

}

class Dog extends Mammal {

  public void makeSound() {
    System.out.println("The dog barks.");
  }
}

class Cat extends Mammal {

  public void makeSound() {
    System.out.println("The cat meows.");
  }
}

public class Multilevel_Inheritance_Example {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Animal animal;

    System.out.println("Choose an animal to create:");
    System.out.println("1. Dog");
    System.out.println("2. Cat");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      animal = new Dog();
    } else if (choice == 2) {
      animal = new Cat();
    } else {
      System.out.println("Invalid choice. Creating generic animal.");
      animal = new Animal();
    }

    System.out.println("\nAnimal Sound:");
    animal.makeSound();

    scanner.close();
  }
}
