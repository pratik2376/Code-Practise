import java.util.HashMap;
import java.util.HashSet;

public class firstNonRepeatingChar {

    public void logic(){
        String a = "aabsc";

        char[] arr = a.toCharArray();

        HashMap<Character,Integer> obj = new HashMap<>();

        for(char b:arr){
            obj.put(b, obj.getOrDefault(b,0)+1);
        }
        for(char c:obj.keySet()){
            if(obj.get(c)==1){
                System.out.println("first repeating character "+c);
                break;
            }
        }
    }

    public void logic2(){

        String input = "sdderff";

        char[] c = input.toCharArray();

        HashSet<Character> obj = new HashSet<>();

        // for(char a: c){
        //     if(!obj.add(a)){
        //         System.out.println("First Repeating Character is - "+a);
        //     }
        // }

        for(int i=c.length-1;i>=0;i--){
            if(!obj.add(c[i])){
                System.out.println("Last Repeating Character is - "+c[i]);
                break;
            }
        }
    }
    public static void main(String[] args){
        firstNonRepeatingChar obj2 = new firstNonRepeatingChar();
        obj2.logic2();

    }    
}
