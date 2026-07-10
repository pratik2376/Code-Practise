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

    public void logic(){
        int a[] = {2,4,5};
        int b[] = {2,5,4};

        Boolean result = Arrays.equals(a, b);

        if (result == true) {
            System.out.println("Arrays is equal");

        }
        else{
            System.out.println("Two Arrays are not equal");
        }
    }
    
    public void logic2(){
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        Boolean result = Arrays.equals(a, b);

        if(result==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
    public static void main(String[] args) {
        arrayEqualOrNot obj = new arrayEqualOrNot();
        obj.logic();
    }

    
}
