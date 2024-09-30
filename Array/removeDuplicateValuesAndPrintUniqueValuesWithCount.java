package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicateValuesAndPrintUniqueValuesWithCount {
    
    public void logic(){
        int[] a = {0,1,2,2,3,0,4,2};

        int b =2;

        ArrayList <Integer> obj = new ArrayList();

        Arrays.sort(a);

        for(int x:a){
            if(x!=b)
            obj.add(x);
        }

        System.out.println("Final array is - " +obj);
        System.out.println("the unique size is - "+ obj.size());
    }

    public static void main(String[] args){
        removeDuplicateValuesAndPrintUniqueValuesWithCount obj = new removeDuplicateValuesAndPrintUniqueValuesWithCount();
        obj.logic();
    }

}
