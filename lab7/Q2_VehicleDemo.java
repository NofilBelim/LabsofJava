package Lab7;
class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void maxSpeed() {
        System.out.println("Vehicle speed not defined.");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int wheels, String fuelType) {
        super(brand, wheels);   // use of super keyword
        this.fuelType = fuelType;
    }

    void maxSpeed() {
        System.out.println("Car max speed: 180 km/h");
    }
}

class Bicycle extends Vehicle {
    String type;

    Bicycle(String brand, int wheels, String type) {
        super(brand, wheels);
        this.type = type;
    }

    void maxSpeed() {
        System.out.println("Bicycle max speed: 30 km/h");
    }
}

class Scooter extends Vehicle {
    int engineCC;

    Scooter(String brand, int wheels, int engineCC) {
        super(brand, wheels);
        this.engineCC = engineCC;
    }

    void maxSpeed() {
        System.out.println("Scooter max speed: 90 km/h");
    }
}

public class Q2_VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("Honda", 4, "Petrol");
        Bicycle b = new Bicycle("Hero", 2, "Gear");
        Scooter s = new Scooter("Activa", 2, 125);

        c.maxSpeed();
        b.maxSpeed();
        s.maxSpeed();
    }
}
