import java.util.*;

public class Tcs {
    public static void main(String args[]){

        String str="abcdefghij google microsoft ggghhhiiijjj aabbccddeeff";
        String res=getRes(str);
        if(res.isEmpty()){
            System.out.print("-1");
        }
        else{
            System.out.print(res);
        }
        

    }
    public static String getRes(String str){
        StringBuilder sb=new StringBuilder();
        int max=0;
        String str1="";
        String []arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            int count=repeated(arr[i]);
            if(count>max){
            
                str1=arr[i];
                max=count;

            }
            
        }
        sb.append(str1);
        
        return sb.toString();

    }
    public static int repeated(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        int sum=0;
        int count1=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Character ch : map.keySet()){
            if(map.get(ch)>1){
                    sum=sum+map.get(ch);
                    //count1=count1+1;

            }
        }
        return sum;
    }
    
}
