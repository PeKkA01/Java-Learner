import java.util.*;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number");
        if(n<0){
            System.out.println("enter the positive number: ");
        }
        double result = 0.0;
        for (int i = 1; i <n ; i++) {
            result = result + 1.0/i;
        }
        System.out.println(result);
        }
    }

