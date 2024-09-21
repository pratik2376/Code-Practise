import java.util.HashMap;
import java.util.Map;


public class DuplicateCharactersWithForLoops {

    public static void findDuplicates() {
        // Convert the string to a character array

        String str ="pprraatt";
        char[] chars = str.toCharArray();
        boolean[] isDuplicate = new boolean[chars.length]; // Array to track if a character is a duplicate
        boolean foundDuplicate = false;

        // Outer loop to pick each character
        for (int i = 0; i < chars.length; i++) {
            // Skip if this character has already been marked as duplicate
            if (isDuplicate[i]) {
                continue;
            }

            int count = 1; // Initialize count for the current character
            boolean isCurrentCharDuplicate = false;

            // Inner loop to count occurrences of the picked character
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    isCurrentCharDuplicate = true;
                    isDuplicate[j] = true; // Mark the duplicate character
                }
            }

            // If a duplicate was found, print it with its count
            if (isCurrentCharDuplicate) {
                System.out.println("Duplicate character: " + chars[i] + " (Count: " + count + ")");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }

    public void usingHashMap(){
        String input = "tessttt";

        HashMap<Character,Integer> obj = new HashMap<>();
        

        System.out.println("Duplicate characters are = ");

        char[] a= input.toCharArray();
        for(char x:a){
            if(obj.containsKey(x)){
                obj.put(x, obj.get(x)+1);
            }
            else{
                obj.put(x, 1);
            }
        }
        System.out.println(obj);
        for (Map.Entry<Character,Integer> entry : obj.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
        
        
    }

    public static void main(String[] args) {
        DuplicateCharactersWithForLoops obj = new DuplicateCharactersWithForLoops();
        // obj.findDuplicates();
        obj.usingHashMap();
    }
}
