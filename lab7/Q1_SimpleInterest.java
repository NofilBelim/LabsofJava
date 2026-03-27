package Lab7;
import java.util.Scanner;

public class Q1_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double ratePercent = sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        double rate = ratePercent / 100.0;
        double years = months / 12.0;

        double interest = principal * rate * years;
        double balance = principal + interest;

        System.out.println("Interest = " + interest);
        System.out.println("Final Balance = " + balance);

        sc.close();
    }
}