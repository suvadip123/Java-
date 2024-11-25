import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class Q6 {
    public static void AcsDesc(int arr[]){
        int len=arr.length;
        int mid=len/2;
        Arrays.sort(arr);
       
        for(int i=0;i<mid;i++){
            System.out.print(arr[i]+" ");
        }
        for(int j=len-1;j>=mid;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,1,3,2,5,9,7,8};
        AcsDesc(arr);

    }
}
