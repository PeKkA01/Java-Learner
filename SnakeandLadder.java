import java.util.*;

public class SnakeandLadder {
    public static void main(String[] args) {
        //int player1;
        int pos=0;
        int snake=4;
        int ladder=5;
        int target=10;
        int dicecount=0;
        Random r=new Random();
        while(pos<target){
            dicecount++;
            int num=r.nextInt(6)+1;
            System.out.println("die number: "+num);

            int opt=r.nextInt(3);
            int newpos=pos;

            if (opt==1) {
                System.out.println("LADDER YAYY +5" );
                newpos=pos + num + ladder;
            }
            else if (opt==2) {
                System.out.println("SNAKE OOPS -4");
                newpos=pos+num-snake;
            }else {
                System.out.println("NO MOVEEE!!");
            }
            if(newpos<0){
                newpos=0;
            } if(newpos<=target){
                pos=newpos;
            }else{
                System.out.println("MOVE CANCELLED!!!");
            }
            System.out.println("Player at Position "+pos);

        }
        System.out.println("PLAYER WINS IN "+dicecount+" times");
    }
}