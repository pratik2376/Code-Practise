package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class reverseLinkedList {

    public void reversUsingColllections(){
        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);

        Collections.reverse(obj);
        System.out.println("Reversed List: " + obj);
    }

    public void withoutCollections(){
        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);

        LinkedList<Integer> reverse = new LinkedList<>();

        for(int i=obj.size()-1; i>=0;i--){
            reverse.add(obj.get(i));
        }
        System.out.println("Reversed List: " + reverse);
    }
    
    public static void main(String[] args){
        reverseLinkedList obj2 = new reverseLinkedList();
        // obj2.reversUsingColllections();
        obj2.withoutCollections();
    }
}
