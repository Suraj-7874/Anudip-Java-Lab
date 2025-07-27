import java.util.Scanner;

class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
}

class Dog extends Animal {

  public void makeSound() {
    System.out.println("The dog barks. bahav bahavavvv....");
  }
}

class Cat extends Animal {

  public void makeSound() {
    System.out.println("The cat meows. meow meowwh....");
  }
}

public class AnimalChoice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Animal animal;

    System.out.println("Choose an animal to create:");
    System.out.println("1. Dog\n2. Cat \n");

    System.out.print("Enter your choice (1 or 2): ");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        animal = new Dog();
        break;
      case 2:
        animal = new Cat();
        break;
      default:
        System.out.println("Invalid choice..");
        animal = new Animal();
    }

    System.out.println("\nAnimal Sound:");
    animal.makeSound();

    sc.close();
  }
}
