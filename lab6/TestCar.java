package Lab6;
abstract class Car {

    int speed;

    void start() {
        System.out.println("Car Started");
    }

    abstract void avg();
    abstract void mode();
}

class Maruti extends Car {

    void avg() {
        System.out.println("Average = 20 km/l");
    }

    void mode() {
        System.out.println("Driving Mode: Eco");
    }
}

class TestCar {
    public static void main(String[] args) {

        Car c = new Maruti();
        c.start();
        c.avg();
        c.mode();
    }
}
