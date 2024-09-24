package HashMap;

import java.util.HashMap;
import java.util.Map;

public class removeSecondHighElement {
    

    public void logic(){

        HashMap <Character, Integer> obj = new HashMap<>();

        obj.put('a', 1);
        obj.put('b',2);
        obj.put('c', 3);
        obj.put('d',4);

        int firstMaxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        char key = ' ';


        for(Map.Entry<Character, Integer> entry :obj.entrySet()){
            if(entry.getValue()>firstMaxValue){
                secondMaxValue=firstMaxValue;
                firstMaxValue=entry.getValue();
            }
            if(entry.getValue()>secondMaxValue && entry.getValue()<firstMaxValue){
                secondMaxValue=entry.getValue();

            }

        }

        for(Map.Entry<Character, Integer> entry :obj.entrySet()){
        if(entry.getValue() == secondMaxValue){
            key=entry.getKey();
        }
    }
         System.out.println("2nd max value is - "+secondMaxValue + "and key is "+ key);
         obj.remove(key);
         System.out.println("Removed 2nd max element - "+obj);

         
    }

    public static void main(String[] args){
        removeSecondHighElement obj = new removeSecondHighElement();
        obj.logic();
    }
}
