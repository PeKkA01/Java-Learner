import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Number of times you want to flip coin");
        int numoftimescoinflip = sc.nextInt();
        if(numoftimescoinflip < 0){
            System.out.println("enter a positive integer");
        }
        for (int i = 0; i < numoftimescoinflip ; i++) {
            int cf = r.nextInt(2);
            if(cf == 0){
                tail++;
        }
            else {
                head++;
            }
        }
        int headPercentage = (head*100/numoftimescoinflip);
        int tailPercentage = (tail*100/numoftimescoinflip);
        System.out.println("Total flip: " + numoftimescoinflip);
        System.out.println("head= " +head+ " (" +headPercentage +"%)" );
        System.out.println("tail= "+tail+ " (" +tailPercentage +"%)");

    }
}
