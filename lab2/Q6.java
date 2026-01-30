package labsofjava;
import java.util.Scanner;
public class Q6 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number");
        int acc= sc.nextInt();
        System.out.println("balance at the beginning of month");
        int bal= sc.nextInt();
        System.out.println("total charges of customer this month");
        int charges= sc.nextInt();
        System.out.println("credits of customer");
        int credit= sc.nextInt();
        System.out.println("limit of credit card");
        int limit= sc.nextInt();
        int newBalance=bal+charges-credit;
        if (limit>newBalance){
            System.out.println("limit exceeded");
        }
        else{
            System.out.println("working");
        }
    }
}
