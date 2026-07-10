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

    public void logic2(){

        int a[] = {2,5,1,4,3};


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array - ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }

    public void logic3(){
        int[] input = {3,2,1,3,6,8,4};

        for(int i=0;i<input.length;i++){
            for(int j =i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;


                }
            }
        }
        System.out.println("Sorted Array is - ");
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]);

        }
    }
    public static void main(String[] args) {
        Sorting obj = new Sorting();
        // obj.logic();
        obj.logic3();
    }
    
}
