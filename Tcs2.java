import java.util.*;
public class Tcs2 {

    public static String lexicoOrder(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                ch=(char)(ch+1);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="Mava";
        System.out.print(lexicoOrder(str));

    }
}
