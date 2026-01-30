import java.util.Scanner;
public class lab1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr two inetegr :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is larger");
    }
    else if (b>a) {
        System.out.println(b+" is larger");
        
    }
    else if(a==b){
        System.out.println("the number are equal");
    }
sc.close();
}

}