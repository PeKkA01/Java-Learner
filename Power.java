import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the power you want to enter");
        int n=sc.nextInt();
        if(n<0||n>31){
            System.out.println("Please write between 1-31");
            return;
        }else{
            for(int i=1;i<=n;i++){
                System.out.print((int)Math.pow(2,i)+" ");
            }
            System.out.println(" ");
        }


    }
}