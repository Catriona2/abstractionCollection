
package abstractionCollection;
import  java.lang.*;

abstract class BaseObject {
  String name;
  String brand;
  public BaseObject(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    abstract void displayDetails();


    public double computeDepreciation(int years, double rate) {
        return rate * years;
    }
}
class Car extends BaseObject {
    private int horsepower;

    public Car(String name, String brand, int horsepower) {
        super(name, brand);
        this.horsepower = horsepower;
    }

    @Override void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Horsepower: " + horsepower);
    }
}
class Laptop extends BaseObject {
    private int ramSize;

    public Laptop(String name, String brand, int ramSize) {
        super(name, brand);
        this.ramSize = ramSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Laptop Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}


 class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", 560);
        Laptop laptop1 = new Laptop("XPS 15", "Dell", 8);


        System.out.println("=== Car Details ===");
        car1.displayDetails();
        System.out.println("Depreciation after 5 years: $" + car1.computeDepreciation(5, 100));

        System.out.println("\n=== Laptop Details ===");
        laptop1.displayDetails();
        System.out.println("Depreciation after 3 years: $" + laptop1.computeDepreciation(3, 300));
    }
}
