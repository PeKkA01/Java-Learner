import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.println("Print all armstrong numbers between 1 to 1000");
        for (int i = 0; i < 1000; i++) {
            int original = i ;
            int sum = 0;
            while (original > 0){
                int num = original % 10;
                sum += num * num * num;
                original /= 10;
            }
            if (sum == i){
                System.out.println(i + " ");
            }

        }
    }

}
