package labsofjava;
import java.lang.String;
class employee{
    String name;
    double salary;
    employee(String name,double salary){
        this.name=name;
        if(salary<0){
            return;
        }
        else {
            this.salary=salary;
        }
    }
    double salary(){
        return salary*12;
    }
    void risesalary(){
        salary=salary+salary*(.10);
    }

}
public class Q3 {
    static void main(String[] args) {
        employee a=new employee("Nofil belim",10000);
        employee b=new employee("unknown",-2000);
        System.out.println("yearly salary of first "+a.salary());
        System.out.println("yearly salary of second "+b.salary());
        a.risesalary();
        b.risesalary();
    }
}
