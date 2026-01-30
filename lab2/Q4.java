package labsofjava;
class Day{
    int day;
    int month;
    int year;
    Day(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void display(){
        System.out.println("Date is "+day+"/"+month+"/"+year);
    }

}
public class Q4 {
    static void main(String[] args) {
        Day a=new Day(26,8,2007);
        a.display();
    }
}
