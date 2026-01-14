import java.util.*;
public class TestLeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year < 1000 || year > 9999){
            System.out.println("please enter a 4 digit year");
        }
        else{
            if(year % 4 == 0){
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " is not a leap year ");
            }


        }


    }
}
