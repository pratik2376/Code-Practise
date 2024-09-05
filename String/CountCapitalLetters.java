import java.util.HashMap;
import java.util.Map;

public class CountCapitalLetters {

    public static void main(String[] args) {
        String input = "AASSsssBBBS.";
        Map<Character, Integer> capitalLetterCounts = countCapitalLetters(input);

        System.out.println("Capital letter counts:");
        for (Map.Entry<Character, Integer> entry : capitalLetterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCapitalLetters(String str) {
        Map<Character, Integer> letterCounts = new HashMap<>();
        
        if (str != null) {
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
                }
            }
        }
        return letterCounts;
    }
}
