package Accenture;

public class HappyNumber {

    public static int digitSum(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+(rem*rem);
            num=num/10;
        }
       
        return sum;
    }
    public static boolean IsHappy(int num){
        int sum;
        while(num>1){
            sum=digitSum(num);
            num=sum;
        }
        if(num==1){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int num=19;
        System.out.println(IsHappy(num));

    }
    
}
