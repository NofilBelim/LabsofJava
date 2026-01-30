import java.util.Scanner;
public class Lab1e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five digit number :");
        int a=sc.nextInt();
        int rem;
        int rev=0;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        while(rev>0){
            rem=rev%10;
            System.out.print(rem+" ");
            rev=rev/10;
        }
        sc.close();
    
    }
    
}
