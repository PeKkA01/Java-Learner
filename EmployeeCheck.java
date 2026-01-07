import java.util.*;
class EmployeeW{
    int working_hour = 8;
    int wageper_hour = 20;
    int parttime_hour = 4;
    int working_days = 20;
    double salary;
    void calculate_salary(){
        salary = working_days*working_hour*wageper_hour;
        System.out.println(salary);
    }
}
public class EmployeeCheck {
    public static void main(String[] args) {
        Random r = new Random();
        EmployeeW e = new EmployeeW();
        int is_fulltime = 1;
        int is_parttime = 2;
        int i = r.nextInt(1000)%3;
        switch (i){
            case 1: {
                if(i==1){
                    System.out.println("Full_Time Employee");
                    break;
                }
            }
            case 2: {
                System.out.println("Part_Time Employee");
                break;
            }
            default:{
                System.out.println("Absent");
            }
        }
        e.calculate_salary();

    }
}
