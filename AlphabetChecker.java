import java.util.Scanner;
public class AlphabetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet");
        char alpha = sc.next().charAt(0);
        if(alpha == 'a' || alpha=='e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonent");
        }
    }
}
