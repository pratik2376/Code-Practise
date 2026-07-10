package RandomProblemStatements;

public class bubbleSort {

    public void logic(){
        int[] a = {1,2,7,4,3,9};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int b : a){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        bubbleSort obj = new bubbleSort();
        obj.logic();
    }
    
}
