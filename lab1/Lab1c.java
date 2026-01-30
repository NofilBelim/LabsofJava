import java.util.Scanner;
public class Lab1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a+b+c)+" is sum of three number");
        System.out.println((a*b*c)+" is product of three number");
        System.out.println(((a+b+c)/3)+" is average of three number");
        if(a>b && a>c){
            if(b>c){
                System.out.println(a+" is largest");
                System.out.println(c+" is smallest");
            }
            else{
                System.out.println(a+" is largest");
                System.out.println(b+" is smallest");
            }
        }
        else if(b>a && b>c){
              if(a>c){
                System.out.println(b+" is largest");
                System.out.println(c+" is smallest");
            }
            else{
                System.out.println(b+" is largest");
                System.out.println(a+" is smallest");
            }
        }
        else if(c>a && c>b){
              if(a>b){
                System.out.println(c+" is largest");
                System.out.println(b+" is smallest");
            }
            else{
                System.out.println(c+" is largest");
                System.out.println(a+" is smallest");
            }
        }
        sc.close();

    }
    
}
