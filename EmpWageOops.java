import java.util.*;
interface EmpWageBuilder{
    public void calWage();
    public void details();
}
class WageSystem implements EmpWageBuilder{
    private final int is_fulltime = 1;
    private final int is_parttime = 2;
    private int wage_per_hour;
    private int num_work_days;
    private int max_hours;
    WageSystem(int wage_per_hour, int num_w, int max_hours){
       this.wage_per_hour = wage_per_hour;
       this.num_work_days = num_work_days;
       this.max_hours = max_hours;
    }
    public void calWage(){
        int total_wage = 0;
        int total_num_of_workdays = 0;
        int total_work_hours = 0;
        Random r = new Random();



        int emp_rate_hour = 0;

        int emp_wage = 0;
        while(total_work_hours < max_hours && total_num_of_workdays<num_work_days){
            total_num_of_workdays++;
            int emp_hours = 0;
            int emp_check=r.nextInt(3);
            switch(emp_check){
                case 1:{
                    if(emp_check==is_fulltime){
                        emp_hours = 8;
                        break;
                    }
                }
                case 2:{
                    if(emp_check==is_parttime){
                        emp_hours = 4;
                        break;
                    }
                }
                default:{
                    emp_hours = 0;
                    break;
                }
            }
            emp_wage = emp_hours*wage_per_hour;
            total_wage +=emp_wage;
            total_work_hours +=emp_hours;
            System.out.println("employee wage" +emp_wage);
        }


    }
    public void details(){
        System.out.println("Max working hours" );
        System.out.println();
    }

}







public class EmpWageOops {
    public static void main(String[] args) {

    }
}
