package lab3ofjava;
import java.util.Scanner;
class Figure{
    double r,a,v;
    public void dispArea(){
        System.out.println("area = "+a);
    }
    public  void dispVoulume(){
        System.out.println("volume = "+v);
    }
}
class Cone extends Figure{
    double h,s;
    public void calArea(){
        a = Math.PI*r*r+Math.PI*r*s;
    }
    public void calVoulome(){
        v = (Math.PI*r*(h/3));
    }
}

public class InheritanceDemo {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Cone c = new Cone();
        System.out.println("enter the radius of cone");
        c.r= sc.nextDouble();
        System.out.println("enter the height of cone");
        c.h= sc.nextDouble();
        c.s=Math.sqrt((c.r)*(c.r)+(c.h)*(c.h));
        c.calArea();
        c.calVoulome();
        c.dispArea();
        c.dispVoulume();
    }

}
