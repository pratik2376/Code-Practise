import java.util.ArrayList;

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

    public static void main(String[] args){
        CountVowelsAndConsonants obj = new CountVowelsAndConsonants();
        obj.logic();
    }
    
}
