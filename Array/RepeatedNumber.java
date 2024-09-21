package Array;

import java.util.*;

public class RepeatedNumber{

    public void logic(){

        int a[]={1,2,3,2,2,2,1,1,1,1};
        HashMap<Integer,Integer> obj = new HashMap<>();
        for(int b:a){
            if(obj.containsKey(b)){
                obj.put(b, obj.get(b)+1);
            }
            else{
                obj.put(b, 1);
            }

        }
        System.out.println("Duplicate Numbers are - ");
        for(Map.Entry<Integer,Integer> entry :obj.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+"count is "+entry.getValue());
            }
        }
        
    }
    
    public static void main(String[] args) {
        RepeatedNumber obj =new RepeatedNumber();
        obj.logic();
    }
}