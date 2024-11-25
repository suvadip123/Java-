import java.util.*;


public class Q8{
	



	public static void main(String args[]){
		int arr1[]={11,1,13,21,3,7};
		int arr2[]={11,1,3,7};
        System.out.println(isSubset(arr1, arr2));

	}
	public static Boolean isSubset(int arr1[],int arr2[]){
		int count=0;
		int len=arr2.length;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					count++;

				}
			}
		}
		if(count==len){
			return true;
		}
		return false;

	}

}
