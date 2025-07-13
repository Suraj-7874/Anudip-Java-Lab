import java.util.Scanner;

public class Car
 {
    
    String madeBy;
    String model;
    short year;
    int price;

    
    public Car(String madeBy, String model, short year, int price) 
    {
        this.madeBy = madeBy;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    
    public void display() {
        System.out.println("Car Details:");
        System.out.println("madeBy  : " + madeBy);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : Rs. " + price);
    }

    
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter car madeBy: ");
        String madeBy = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car year: ");
        short year = sc.nextShort();

        System.out.print("Enter car price: ");
        int price = sc.nextInt();

       
        Car DreamCar = new Car(madeBy, model, year, price);

       
        DreamCar.display();

       
    }
}
