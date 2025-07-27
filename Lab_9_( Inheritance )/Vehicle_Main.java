class Vehicle {
  String make, model;
  int year, maximumSpeed;

  Vehicle(String make, String model, int year, int maximumSpeed) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.maximumSpeed = maximumSpeed;
  }

  public void drive() {
    System.out.println("Vehicle Drive ....");
  }
}

class Car extends Vehicle {
   Car(String make, String model, int year, int maximumSpeed) {
    super(make, model, year, maximumSpeed);
  }

 
  public void drive() {
    System.out.println(make + " " + model + " Car is driving.\n");
  }

  public void display() {
    System.out.println("Car Details :- ");
    System.out.println("----------------------------------------------------------");
    System.out.println("Make =\t" + make);
    System.out.println("Model =\t" + model);
    System.out.println("Year =\t" + year);
    System.out.println("MaximumSpeed =\t" + maximumSpeed + " km/h");
     System.out.println("----------------------------------------------------------\n");
  }
}

class Bike extends Vehicle {
   Bike(String make, String model, int year, int maximumSpeed) {
    super(make, model, year, maximumSpeed);
  }

 
  public void drive() {
    System.out.println(make + " " + model + " Bike is driving.\n");
  }

  public void display() {
    System.out.println("Bike Details :- ");
    System.out.println("----------------------------------------------------------");
    System.out.println("Make =\t" + make);
    System.out.println("Model =\t" + model);
    System.out.println("Year =\t" + year);
    System.out.println("MaximumSpeed =\t" + maximumSpeed + " km/h");
     System.out.println("----------------------------------------------------------");
  }
}

public class Vehicle_Main  {
  public static void main(String args[]) {
    Car c = new Car("Toyota", "Camry", 2020, 180);
    Bike b = new Bike("Yamaha", "R15", 2022, 140);

    c.drive();
    c.display();

    b.drive();
    b.display();
  }
}
