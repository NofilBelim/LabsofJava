package labsofjava;
import java.util.Scanner;
public class Q5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalmiles=0,totalgallons=0;
        while(true){
            System.out.println("enter the miles driven(enter negative value to quit)");
            double miles = sc.nextDouble();
            if(miles<0){
                break;
            }
            System.out.println("gallons used");
            double gallons=sc.nextDouble();
            totalmiles+=miles;
            totalgallons+=gallons;
            System.out.println("miles per gallons "+(miles/gallons));
        }
        System.out.println("total miles per total gallons is "+(totalmiles/totalgallons));

    }

}
