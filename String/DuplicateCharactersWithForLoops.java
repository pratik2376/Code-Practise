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

    public static void main(String[] args) {
        DuplicateCharactersWithForLoops obj = new DuplicateCharactersWithForLoops();
        obj.findDuplicates();
    }
}
