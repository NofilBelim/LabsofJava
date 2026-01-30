package labsofjava;
import java.lang.String;

class Invoice{
    String partNumber;
    String description;
    int quantity;
    double price;
    Invoice(String partNumber,String description,int quantity,double price){
        this.partNumber=partNumber;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    }
    double totalAmount(){
        return quantity*price;
    }

}
public class Q2 {
    static void main(String[] args) {
        Invoice a = new Invoice("A123","keyboard",5,250);
        double amount=a.totalAmount();
        System.out.println("your invoice for "+a.partNumber+" and "+a.description+" is "+amount);
    }
}
