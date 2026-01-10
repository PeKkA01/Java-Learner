
public class PrimeNumber {
    public static void main(String[] args) {
        for (int n = 2; n <=100 ; n++) {
            boolean Prime = true;
            for (int i = 2; i <n ; i++) {
                if(n % i ==0){
                    Prime = false;
                    break;
                }

                }
            if(Prime){
                System.out.println(n + "");
            }
        }
    }
}
