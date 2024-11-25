package Accenture;

public class Q1 {
    public static int IsOccurence(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'){
                count=count+1;
            }
        }
        System.out.println(count);
        return count;
    }
    
    public static void main(String args[]){
        String str="suvadipa";
        System.out.println(IsOccurence(str));

    }
}
