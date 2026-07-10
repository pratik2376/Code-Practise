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

    public void logic2(){
        int a[] = {1,2,4};

        int MissNum = a.length+1;

        int expectedSum = MissNum * (MissNum+1)/2;

        int actualSum = 0;

        for(int b:a){
            actualSum=actualSum+b;
        
        }

        int mn = expectedSum - actualSum;
        System.out.println("Missing number is - "+mn);
    }

    public void logic3(){

        int[] a = {1,2,4,5};

        int mn = a.length+1;

        int expectedSum = mn * (mn+1)/2;

        int as = 0;

        for(int s:a){
            as=as+s;
        }

        int mn2 = expectedSum - as;

        System.out.println("Missing Number is - "+mn2);
    }

    public static void main(String[] args){
        FindMissingNumber obj = new FindMissingNumber();
        obj.logic3();
    }
    
}
