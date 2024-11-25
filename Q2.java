import java.util.*;

public class Q2{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		//int mat[][]=new int[m][n];
		int m=sc.nextInt();
		int n=sc.nextInt();
		int mat[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
			}
		}	
		System.out.println(maxOne(mat));
	}

	public static int maxOne(int [][]arr){
		int count=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==1){
					count++;
				}
			}
		if(count>max){
			max=i;
		}
	}
	return max;


	}
}


