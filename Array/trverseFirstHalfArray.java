package Array;

public class trverseFirstHalfArray {

    public void reverseLogic(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Print original array
        System.out.print("Original array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Determine the midpoint of the array
        int n = array.length;
        int mid = n / 2;
        
        // Reverse the first half of the array using a for loop
        for (int i = 0; i < mid / 2; i++) {
            // Swap elements
            int temp = array[i];
            array[i] = array[mid - 1 - i];
            array[mid - 1 - i] = temp;
        }
        
        // Print modified array
        System.out.print("Array after reversing the first half: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    
    }

    public static void main(String[] args) {
        trverseFirstHalfArray obj = new trverseFirstHalfArray();
        obj.reverseLogic();
    }
    
}
