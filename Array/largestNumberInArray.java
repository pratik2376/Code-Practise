package Array;

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
    
    public static void main(String[] args) {
        largestNumberInArray obj =new largestNumberInArray();
        obj.largeNumberLogic();
    }
}
