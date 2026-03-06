package Lab5;
class Product{
    protected int productId;
    protected String name;
    protected int categoryId;
    protected double price;
    Product(int productId,String name,int categoryId,double price){
        this.productId=productId;
        this.name=name;
        this.categoryId=categoryId;
        this.price=price;
    }
    public void displayproduct(){
        System.out.println("product id "+productId);
        System.out.println("prroduct name "+name);
        System.out.println("category id"+categoryId);
        System.out.println("price "+price);
    }
}
class ElectricalProduct extends Product{
    private String voltagerange;
    private int wattage;
    ElectricalProduct(String voltagerange,int wattage,int productid,String name,int categoryId,double price){
        super(productid,name,categoryId,price);
        this.voltagerange=voltagerange;
        this.wattage=wattage;
    }
    public void updatedetails(int newWattage,int newPrice){
        this.wattage=newWattage;
        this.price=newPrice;
    }
    public void Electricaldisplayproduct() {
        displayproduct();
        System.out.println("voltage range"+ voltagerange);
        System.out.println("wattage"+wattage);
    }
}
public class Q3 {
    static void main(String[] args) {
        ElectricalProduct ep= new ElectricalProduct("220v-240v",75,101,"fan",5,3000);
        System.out.println("before update");
        ep.Electricaldisplayproduct();
        ep.updatedetails(90,3000);
        System.out.println("after update");
        ep.Electricaldisplayproduct();
    }
}
