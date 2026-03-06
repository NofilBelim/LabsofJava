package Lab5;
class Fruit{
    private String name;
    private String type;
    private double price;
    Fruit(String name,String type,double price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public void display(){
        System.out.println("Fruit is "+name);
        System.out.println("Fruit type is "+type);
        System.out.println("Fruit price is"+price);
    }
}
public class Q4 {
    static void main(String[] args) {
        Fruit a = new Fruit("apple","single",100);
        Fruit b=new Fruit("banana","bunch",120);
        a.display();
        b.display();
    }
}
