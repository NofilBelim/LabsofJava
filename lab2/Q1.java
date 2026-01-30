package labsofjava;
import java.util.Scanner;
public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Miles driven per day");
        double a = sc.nextDouble();
        System.out.println("Cost per gallon of gasoline");
        double b= sc.nextDouble();
        System.out.println("Average fees for per day mile");
        double c= sc.nextDouble();
        System.out.println("Parking fees per day");
        double d= sc.nextDouble();
        System.out.println("Tolls per day");
        double e= sc.nextDouble();
        double fuelcost=(a/c)*b;
        double totalcost= d+fuelcost+e;
        System.out.println("Daily Driving Cost :"+totalcost);
        sc.close();

    }
}
