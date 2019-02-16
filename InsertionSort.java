import java.util.*;
public class InsertionSort {
    public static void main(String args[]) {
        
        int[] arr = {7,6,1,9,3,5,2};
        
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            
        }

        System.out.println(Arrays.toString(arr));
        for(int b: arr){
            System.out.println(b);
        }
    }
}
