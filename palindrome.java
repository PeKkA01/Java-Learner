//import java.util.Scanner;
//public class palindrome {
//    public static void main(String[] args) {
//        int reverse = 0;
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int original = num;
//        while (num!=0){
//            int remainder= num %10;
//            reverse =  reverse *10+remainder;
//            num= num/10;
//
//        }
//        if (original == reverse){
//            System.out.println("entered number is palindrome");
//        }
//        else {
//            System.out.println("entered number is not palindrome");
//        }
//
//
//    }
//
//}


import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("reversing number");

        int num = 1234;
        int result = 0;
        while(num != 0){
            int digit  = num%10;
            result = result*10+digit;
            num = num/10;

        }
        System.out.println(result);
    }
}