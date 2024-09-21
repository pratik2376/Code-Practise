package Array;
import java.util.Arrays;

public class arrayEqualOrNot {

    public void arrayEqualLogic(){
        
        int a[] = { 30, 25, 40 }; 

        int b[] = { 30, 25, 40}; 
  
        boolean result = Arrays.equals(a, b); 
  
        // condition to check whether the 
        // result is true or false 
        if (result == true) { 
            // Print the result 
            System.out.println("Two arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Two arrays are not equal"); 
        } 
    } 
    
    public static void main(String[] args) {
        arrayEqualOrNot obj = new arrayEqualOrNot();
        obj.arrayEqualLogic();
    }

    
}
