import java.util.*;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("enter coordinates of lenth_of_line1 ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length_of_line1= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(length_of_line1);

        System.out.println("enter coordinates of lenth_of_line2 ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double length_of_line2= Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        Double l1 = length_of_line1;
        Double l2 = length_of_line2;
        int result = l1.compareTo(l2);
        if(result == 0){
            System.out.println("Both lines are equal");
        } else if (result > 0){
            System.out.println("line1 is greater");
        }
        else {
            System.out.println("line2 is greater");
        }
    }
}

