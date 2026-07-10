package HashMap;

import java.util.HashMap;

public class countNumberOfOccuranceOfChar {

    public void countCharOccurance()
    {
        HashMap <Character,Integer> obj = new HashMap<>();

        String s = "hellllowe";

        char [] a = s.toCharArray();

        for(char c: a){
            if (obj.containsKey(c)){
                obj.put(c, obj.get(c)+1);
            }
            else{
                obj.put(c, 1);
            }
        }

        System.out.println(obj.toString());
    }

    public void logic(){
        String input = "pratikk";

        HashMap<Character,Integer> obj = new HashMap<>();

        char[] a = input.toCharArray();

        for(char x:a){
            if(obj.containsKey(x)){
                obj.put(x, obj.get(x)+1);
            }
            else{
                obj.put(x,1 );
            }
        }

        System.out.println("Each element count - "+obj.toString());
    }

    public static void main(String[] args){
        countNumberOfOccuranceOfChar obj2 = new countNumberOfOccuranceOfChar();
        obj2.logic();
    }
    
}
