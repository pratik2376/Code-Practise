import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class CountCapitalLetters {

    // public static void main(String[] args) {
    //     String input = "AASSsssBBBS.";
    //     Map<Character, Integer> capitalLetterCounts = countCapitalLetters(input);

    //     System.out.println("Capital letter counts:");
    //     for (Map.Entry<Character, Integer> entry : capitalLetterCounts.entrySet()) {
    //         System.out.println(entry.getKey() + ": " + entry.getValue());
    //     }
    // }

    // public static Map<Character, Integer> countCapitalLetters(String str) {
    //     Map<Character, Integer> letterCounts = new HashMap<>();
        
    //     if (str != null) {
    //         for (char c : str.toCharArray()) {
    //             if (Character.isUpperCase(c)) {
    //                 letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
    //             }
    //         }
    //     }
    //     return letterCounts;
    // }


    public void logic(){

        String input = "AASSsssBBB";
        int count=0;

        Pattern obj = Pattern.compile("[A-Z]");
        Matcher obj2 = obj.matcher(input);
        System.out.println("capital letters are: ");
        while(obj2.find()){
            count ++;
        }
        System.out.println(count);

    }

    public static void main(String[] args){
        CountCapitalLetters obj = new CountCapitalLetters();
        obj.logic();
    }
}
