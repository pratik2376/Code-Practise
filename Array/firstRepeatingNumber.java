package Array;
import java.util.*;
 
public class firstRepeatingNumber {
    
    public static int firstRepeatingNumber(int[] arr, int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,3,5,6,7 };
        int n = arr.length;
        
        int index = firstRepeatingNumber(arr, n);
 
       
        if (index == -1) {
            System.out.println("No repeatingnumber");
        }
        else {
            
            System.out.println("First repeating number is " + arr[index]);
        }
    }

}
