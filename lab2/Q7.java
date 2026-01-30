package labsofjava;
import java.util.Scanner;
class ParkingGarage{
    double calculateCharges(double hours) {
        double charge = 2;
        if(hours>3){
            charge=charge+(hours-3)*(.5);
        }
        if(charge>10){
            charge=10;
        }
        return charge;
    }
}
public class Q7 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ParkingGarage a=new ParkingGarage();
        double total=0;
        int customer =1;
        while(true){
            System.out.println("enter hours parked for customer "+customer+" enter -1 to stop");
            double hours = sc.nextDouble();
            if(hours==-1){
                break;
            }
            double charges = a.calculateCharges(hours);
            total=total+charges;
            System.out.println("charges for "+customer+" is "+charges);
            customer++;
        }
        System.out.println("total charges of a day "+total);
        sc.close();
    }

}
