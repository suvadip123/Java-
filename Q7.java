import java.util.*;

public class Q7{
	public static void main(String args[]){
		int arr1[]={11,1,13,21,3,7};
		int arr2[]={2,8,4,5};
		System.out.print(isSubSet(arr1,arr2));

	}


	public static boolean isSubSet(int arr1[],int arr2[]){
		
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			int temp=arr1[i];
			if(map.containsKey(temp)){
				map.put(temp,map.get(temp)+1);
            }    
			else{
				map.put(temp,1);

			}
		}
		for(int j=0;j<arr2.length;j++){
			int temp1=arr2[j];
			if(map.containsKey(temp1)){
				return true;
			}
		}
		return false;

    }

}