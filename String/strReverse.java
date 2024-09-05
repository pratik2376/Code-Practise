public class strReverse {

    public void reverseLogicWithoutSequence()
    {
        String input = "My name is Pratik";

        /*
         * Unlike String, which creates immutable objects, StringBuilder allows you to modify the character sequence without creating new objects for every change.
         * Operations - 
         * 
         * sb.append(" World");  // sb now contains "Hello World"
         * sb.insert(6, "Beautiful ");  // sb now contains "Hello Beautiful World"
         * sb.delete(6, 16);  // sb now contains "Hello World"
         * sb.replace(6, 11, "Universe");  // sb now contains "Hello Universe"
         * sb.reverse();  // sb now contains "olleH"
         * int length = sb.length();  // length is 5
         * int capacity = sb.capacity();  // default capacity is 16
         * 
         */

        StringBuilder result = new StringBuilder("My name is Pratik");
        result.reverse();
        System.out.println("Result is = "+result);
    }

    public void reverseLogicWithSequence(){

        String input = "My name is Pratik";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        /*
         *  for-each loop is used to iterate over elements in an array or a collection, such as a List, Set, or any other collection that implements the Iterable interface.
         * 
         * String word: This declares a variable named word of type String. During each iteration of the loop, word will hold the current element of the words collection.
         * 
         * words: This is the collection or array that you are iterating over. It should be an array of String or a collection of String objects (e.g., List<String>, Set<String>, etc.).
         */

        for (String word:words){

            // Reverse the current word
            
            String reverseWord = new StringBuilder(word).reverse().toString();

            // append the reversed word and a space to the result.

            result.append(reverseWord).append(" ");


        }

        System.out.println("reversed string is - "+result);


    }
    public static void main(String[] args){
        strReverse obj = new strReverse();
        obj.reverseLogicWithoutSequence();
        obj.reverseLogicWithSequence();
    }
}
