package Array;

import java.util.HashMap;

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
        System.out.println(obj);
        
    }
    
    public static void main(String[] args) {
        RepeatedNumber obj =new RepeatedNumber();
        obj.logic();
    }
}