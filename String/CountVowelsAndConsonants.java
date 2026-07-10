import java.util.ArrayList;
import java.util.HashMap;

public class CountVowelsAndConsonants {

    public void logic(){

        String input = "Hello World";
        int count =0;

        char[] ip =input.toCharArray();
        ArrayList<Character> obj = new ArrayList<>();
        System.out.println("consonants are - ");
        for(char x:ip){
            if(x =='a' || x =='e' || x =='i' || x =='o' || x =='u'){
                count++;
                obj.add(x);
            }
            else{
                System.out.println(x);
            }
        }

        System.out.println("the vowels count is - "+count);
        System.out.println("The vowels are - "+obj);

    }

    public void withHashMap(){

        String input = "Hello World";
        
        char[] a = input.toCharArray();

        HashMap <Character,Integer> obj =  new HashMap<>();

        for(char c :a){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                if(obj.containsKey(c)){
                    obj.put(c, obj.get(c)+1);

                }
                else{
                    obj.put(c, 1);
                }

            }
        }
        System.out.println(obj.toString());
    }
    public void logic2(){

        String input = "hello world";

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> constants = new ArrayList<>();

        char[] a = input.toCharArray();

        for(char b: a){
            if( b=='a' || b=='e' || b=='i' || b=='o'){
               
                    vowels.add(b);


            }
            else{
                constants.add(b);

            }
        }

        System.out.println("vowels are - "+ vowels.toString());
        System.out.println("vowel count is - "+ vowels.size());
        System.out.println("constants are - "+ constants.toString());
        System.out.println("constants count is - "+ constants.size());

    }

    public static void main(String[] args){
        CountVowelsAndConsonants obj = new CountVowelsAndConsonants();
        obj.logic2();
    }
    
}
