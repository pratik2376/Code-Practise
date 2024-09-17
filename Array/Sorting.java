package Array;

import java.util.Arrays;

public class Sorting {

    public void logic(){

        int a[]={2,4,6,3,1,9,3};

        Arrays.sort(a);

        for(int b:a){
            System.out.println(b);
        }

    }

    public void sortUsingForLoop(){

        int array[]={2,4,6,3,1,9,3};

        int n = array.length;
       
        for (int i = 0; i < n - 1; i++) {
           
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    
    }
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        // obj.logic();
        obj.sortUsingForLoop();
    }
    
}
