package Array;

public class trverseFirstHalfArray {

    public void reverseLogic(){
        int[] array = {11,55,65,7,3,4};
        System.out.println("Final array is");
        for(int i=(array.length-1)/2;i>=0;i--){
            System.out.println(array[i]);
            
        }
        for(int j=(array.length-1)/2+1;j<array.length;j++){
            System.out.println(array[j]);
        }
    }

    public static void main(String[] args) {
        trverseFirstHalfArray obj = new trverseFirstHalfArray();
        obj.reverseLogic();
    }
    
}
