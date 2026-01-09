import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println("factorial of " + num + " is: " + factorial);
    }
    

    }

