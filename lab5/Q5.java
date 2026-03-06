package Lab5;
import java.util.Scanner;

public class Q5 {   // Function to calculate tax (15%)
    public static double calculateTax(double grossPay) {
        return grossPay * 0.15;
    }

    // Function to calculate net pay from hours worked
    public static double calculateNetPay(int hoursWorked) {
        double hourlyRate = 12.0;
        double grossPay = hoursWorked * hourlyRate;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        double grossPay = hours * 12;
        double tax = calculateTax(grossPay);
        double netPay = calculateNetPay(hours);

        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Tax (15%): $" + tax);
        System.out.println("Net Pay: $" + netPay);
    }
}


