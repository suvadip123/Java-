import java.util.HashMap;

public class Q5{
    public static void ArrayFrequency(int[]arr){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }else{
                mp.put(temp,1);
            }
        }
        for(Integer key:mp.keySet()){
            System.out.print(key+"->"+mp.get(key)+" ");
        }
    }

    public static void main(String args[]){
        int []arr={1,2,3,4,2,1,5,6,7};
        ArrayFrequency(arr);

    }
    
}
