import java.util.*;
public class EmployeeCheck{
    public static  int is_part_time=1;
    public static   int is_full_time=2;
    public static  int emp_rate_per_hour=20;
    public static  int total_num_Work_day=2;
    public static  int max_hrs=10;
    public static void main(String[] args) {
        int emp_hrs=0;
        int emp_wage=0;
        int total_wage=0;
        int total_working_days=0;
        int total_emp_hours=0;
        Random r=new Random();
        while(total_emp_hours <= max_hrs && total_working_days < total_num_Work_day){
            total_working_days++;
            int emp_check=r.nextInt(1000)%3;
            switch(emp_check){
                case 1:{
                    if(emp_check==is_full_time){
                        emp_hrs=8;
                        break;
                    }
                }
                case 2:{
                    if(emp_check==is_part_time){
                        emp_hrs=4;
                        break;
                    }
                }
                default:{
                    emp_hrs=0;
                    break;
                }

            }
            emp_wage=emp_hrs*emp_rate_per_hour;
            total_wage += emp_wage;
            System.out.println("Emp Wage: "+emp_wage);
            total_emp_hours += emp_hrs;
            System.out.println("Total Wage: "+total_wage);
        }
    }

}