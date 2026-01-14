import java.util.Scanner;
public class TestDivide {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter Dividend");
        int dividend = sc.nextInt();
        System.out.println("enter Divisor");
        int divisor = sc.nextInt();
        int quotient = dividend/divisor;
        System.out.println("quotient:" +quotient);
        int remainder = dividend%divisor;
        System.out.println("remainder" +remainder);
    }
}
