//To calculate Fibonacci Series up to n numbers.
//
//import java.util.Scanner;
//public class fibonacci {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number");
//        int num = in.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i = 1; i <=num; i++) {
//            int temp = a+b;
//             a = b;
//             b = temp;
//            System.out.println(a+ "   " +b);
//        }
//        }
//    }
//
//

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < num ; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}

