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

    public void logic(){
        int[] a={2,3,4,5,4,6};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("First repeating char is - "+ a[i]);
                    break;
                }
            }
        }
    }
    public void logic2(){
        int a[] = {2,3,2,3,4};

        HashSet<Integer> obj = new HashSet<>();

        for(int i:a){
            if(obj.add(i)){
                System.out.println("Element added");
            }
            else{
                System.out.println("First Repeating number is - "+i);
                break;
            }
            

        }

     }

     public void logic3(){

        int a[] = {2,3,2,4,3};

        HashSet<Integer> obj = new HashSet<>();

        for(int f: a){
            if(obj.add(f)){
                System.out.println("Element Added");
            }
            else{
                System.out.println("First repeating number - "+f);
                break;
            }
        }
     }
 
    public static void main(String[] args) {
        
    //     int[] arr = {1,2,3,1,3,5,6,7 };
    //     int n = arr.length;
        
    //     int index = firstRepeatingNumber(arr, n);
 
       
    //     if (index == -1) {
    //         System.out.println("No repeatingnumber");
    //     }
    //     else {
            
    //         System.out.println("First repeating number is " + arr[index]);
    //     }

    firstRepeatingNumber obj  = new firstRepeatingNumber();
    obj.logic3();
     }

}
