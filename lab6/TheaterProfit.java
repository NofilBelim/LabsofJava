package Lab6;
import java.util.Scanner;

public class TheaterProfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int people = sc.nextInt();

        double ticketPrice = 5;
        double costPerPerson = 0.50;
        double fixedCost = 20;

        double totalIncome = people * ticketPrice;
        double totalCost = fixedCost + (people * costPerPerson);

        double profit = totalIncome - totalCost;

        System.out.println("Total Profit: $" + profit);
    }
}