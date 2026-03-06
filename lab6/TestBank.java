package Lab6;
class Bank {

    double deposit(double amount, double balance) {
        balance = balance + amount;
        return balance;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            balance = balance - amount;
            return balance;
        } else {
            return 0;
        }
    }
}

public class TestBank {
    public static void main(String[] args) {

        Bank b = new Bank();

        double balance = 1000;

        balance = b.deposit(500, balance);
        System.out.println("After Deposit: " + balance);

        balance = b.withdraw(300, balance);
        System.out.println("After Withdraw: " + balance);
    }
}