package Array;
import java.util.*;

public class largestNumberInArray {
    
    public void largeNumberLogic(){
        // Example array
        int[] numbers = {10, 25, 14, 32, 50, 8, 30};
        
        // Check if the array is empty
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        
        // Initialize the largest element with the first element of the array
        int largest = numbers[0];
        
        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }

    public void usingSort(){
        int[] numbers = {10, 25, 14, 32, 50, 8, 30};

        Arrays.sort(numbers);

        int maxNumber = numbers[numbers.length-1];

        System.out.println("MAx number is - "+ maxNumber);

    }

    public void practise(){
        int a[] = {2,3,4,5};

        int max = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
         System.out.println("The largest element in the array is: " + max);
    }

    public void logic(){
        int a[] = {3,5,7,1,2};

        int max = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.println("The largest number is - "+ max);
    }

    public void logic3(){
        int[] a = {2,3,4,5};

        int max = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The largest number is - "+max);
    }

    public void secondLargeElement(){
        int a[] = {3,4,5,6,2};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i] != max){
                secondMax=a[i];
            }
        }
        System.out.println("The largest number is - "+ max);
        System.out.println("The second largest number is - "+ secondMax);

        // sorting Logic
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }
        System.out.println("Sorted Array is - ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Final array after removing second largest element is - ");
        for(int i = 0; i < a.length; i++){
            if(i == a.length - 2) {
                continue; // skip 2nd last element
            }
            System.out.println(a[i]);
        }
    
    }
    
    public static void main(String[] args) {
        largestNumberInArray obj =new largestNumberInArray();
        // obj.largeNumberLogic();
        //obj.usingSort();
        obj.secondLargeElement();
    }
}
