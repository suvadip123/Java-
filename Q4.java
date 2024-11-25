import java.util.*;


public class Q4{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		sortOne(arr);
	}
	public static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
	public static void sortOne(int []arr){
		int len=arr.length;
		int low=0;
		int mid=0;
		int high=len-1;
		while(mid<=high){
			if(arr[mid]==0){
				//swap(arr[low],arr[mid]);
				int temp1=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp1;
				low++;
				mid++;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else{
				//swap(arr[mid],arr[high]);
				int temp2=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp2;

				high--;
				
			}
			
		}
		mid=0;
		high=len-1;
		for(int j=mid;j<=high;j++){
			System.out.print(arr[j]+" ");
			//System.out.println("Sayak Jana");
		}
	}


} 
		