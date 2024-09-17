package Array;

public class FindMissingNumber {

    public void logic(){

        int a[]={1,2,3,4,5,6,7,9};

        int missingNumber=a.length+1;

        int expectedSum = missingNumber*(missingNumber+1)/2;

        int actualSum =0;

        for(int b:a){
            actualSum+=b;
        }

        int missingN=expectedSum-actualSum; 

        System.out.println(expectedSum);

        System.out.println("Missing Number is - "+missingN);

    }

    public static void main(String[] args){
        FindMissingNumber obj = new FindMissingNumber();
        obj.logic();
    }
    
}
