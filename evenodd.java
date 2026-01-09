import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if (number % 2 == 0){
            System.out.println("number is an even number");}
        else {
            System.out.println("number is an odd number");
        }
//        System.out.println("   " +number);


    }

}
