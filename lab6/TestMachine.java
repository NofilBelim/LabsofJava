package Lab6;
class WashingMachine {

    void switchOn() {
        System.out.println("Machine Switched ON");
    }

    int acceptClothes(int clothes) {
        System.out.println("Clothes accepted: " + clothes);
        return clothes;
    }

    void acceptDetergent() {
        System.out.println("Detergent added");
    }

    void switchOff() {
        System.out.println("Machine Switched OFF");
    }
}

public class TestMachine {
    public static void main(String[] args) {

        WashingMachine w = new WashingMachine();

        w.switchOn();
        w.acceptClothes(5);
        w.acceptDetergent();
        w.switchOff();
    }
}