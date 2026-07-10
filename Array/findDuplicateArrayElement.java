package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateArrayElement {

    public void findDuplicateElement()
    {

        int[] a = {1,2,3,4,1,2};

        Set<Integer> obj = new HashSet<>();
        List<Integer> listObj = new ArrayList<>();

        for(int b:a){
            if(!obj.add(b)){
                listObj.add(b);
            }
        }

        System.out.println("Duplicates are - ");
        System.out.println(listObj.toString());

    }
    public void logic(){
        int a[] = {2,3,2,3,4};

        HashSet<Integer> obj = new HashSet<>();

        for(int i:a){
            if(obj.add(i)){
                System.out.println("Element added");
            }
            else{
                System.out.println("Common elements are -"+i);
            }
            

        }

     }
 

    public static void main(String[] args) {
        findDuplicateArrayElement obj3 = new findDuplicateArrayElement();
        obj3.findDuplicateElement();
    }
    
}
