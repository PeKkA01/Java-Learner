import java.sql.SQLOutput;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("value of num1: " + num1);
        System.out.println("value of num2: " + num2);

    }
}
