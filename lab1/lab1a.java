import java.util.Scanner;

public class lab1a {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter two integer :");
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("your add,sub,multi,div");
     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
     sc.close();
    }
}