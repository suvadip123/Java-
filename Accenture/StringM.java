import java.util.*;`

public class StringM {
    
    public static void main(String args[]){
        String str="aba";
        isPallindrome(str);
    }

    public static boolean isPallindrome(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }

        }
        return true;

    }


}
