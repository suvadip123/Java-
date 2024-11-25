import java.util.*;

public class Q1{


	public static void main(String args[]){

		String str="###****";
		printInput(str);

	}
	public static void printInput(String str){
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='*'){
				count1++;
			}
			else if(ch=='#'){
				count2++;
			}
		}
		if(count1==count2){
			System.out.print("0");
		}
		else if(count1>count2){
			System.out.println("1");
		}
		else{
			System.out.println("2");
		}
	}
}	

		