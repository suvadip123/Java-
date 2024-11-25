import java.util.*;
public class LTI1 {


    public static void main(String args[]){
            int arr1[]={3,4,2};
            int arr2[]={5,3,4};
            System.out.print(minStock(arr1,arr2));

    }
    public static int minStock(int arr1[],int arr2[]){
        int sum=0;
        int sum1=0;
        int len=arr1.length;
       

        for(int i=0;i<len;i++){
            if(arr1[i]>arr2[i]){
                int diff=arr1[i]-arr2[i];
                sum=sum+diff;
            }
            else{
                int diff1=arr2[i]-arr1[i];
                sum1=sum1+diff1;
            }
            
        }
        System.out.println(sum);
        System.out.println(sum1);
        int res=sum1-sum;
        return res;
    }
    
}
