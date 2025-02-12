package LAB5;

class Vehicle {
    String brand;
    String model;
    double price;

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    int chargingTime;

    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}

class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}

public class VehicleFun{
    public static void main(String[] args){
        Car c1 = new Car("BMW", "M4", 7500000, 2, "Petrol");
        ElectricCar ec1 = new ElectricCar("Tesla", "X", 5000000, 5, "Battery", 700, 8);
        Motorcycle m1 = new Motorcycle("Royal Enfield", "Continental GT 650", 400000, 648, "Cafe Racer");

        System.out.println("Car Details: ");
        c1.displayDetails();

        System.out.println("\nElectric Car Details: ");
        ec1.displayDetails();
        
        System.out.println("\nBike Details: ");
        m1.displayDetails();
    }
}
