import java.util.*;

public class Accenture2 {
    





    public static void main(String args[]){

        int num =143;
        System.out.println(revNum(num));

    }
    public static boolean isMagic(int num){

        
    }
    public static int revNum(int num){
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum=(sum*10)+temp;
            num=num/10;
        }
        return sum;
    }



}
