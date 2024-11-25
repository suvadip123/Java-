import java.util.*;
public class Accenture1 {

    public static String subStr1(String str,int k){
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //sb.append(ch);
            if(ch==' '){
                c++;
                if(c==k){
                    break;
                }
            
            }
            sb.append(ch);
        }
        return sb.toString();

    }
    //  I AM BOY

    public static void main(String args[]){
        String str="MY NAME IS SUVADIP MAITI";
        System.out.print(subStr1(str, 3));
        //System.out.println("Hello");

    }
    
}
