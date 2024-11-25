package Array_important;

public class Q1 {

    public static void main(String args[]){
        int arr[]={102,4,100,1,103,3,2,1,1};
        System.out.println(longestSubSequence(arr));

    }
    public static int longestSubSequence(int arr[]){
        int longest=1;
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            while(linearSearch(arr,x+1)==true){
                x=x+1;
                count=count+1;
                //System.out.println(count);
                //longest=count;

            }
            //System.out.println(longest);
            if(count>longest){
                longest=count;
            }

        }
        return longest;
    }
    public static boolean linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
            //return false;
        }
        return false;
    }
}





