package Array;

public class reverseArray {
    
    public void reverseLogic(){
        int[] a={1,3,4,5,6};

        System.out.println("Reversed Array is - ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        reverseArray obj = new reverseArray();
        obj.reverseLogic();
    }
}
