import java.util.Scanner;
public class Lab1d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius of circle :");
        int a=sc.nextInt();
        double pi=3.14159;
        System.out.println((2*a)+" is diameter of circle" );
        System.out.println((2*pi*a)+" is circumfrence of circle");
        System.out.println((pi*a*a)+" is area of circle");
        sc.close();
    }
}
