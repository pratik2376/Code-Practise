import java.util.HashSet;

public class removeDuplicateFromStr {

    public void removeDuplicateLogic(){

        String input = "PRRRRRRRRRRRRAAAAAAAAAAAAAAAAAAAATTTTTTTTTTTTTTTIIIIIIIIIKKKKKK";

        char[] inputArray = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            boolean isDuplicate = false;

            // Check if the current character is already in the output string
            for (int j = 0; j < output.length(); j++) {
                if (inputArray[i] == output.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, append it to the output
            if (!isDuplicate) {
                output.append(inputArray[i]);
            }
        }

        System.out.println("String with no duplicate values - "+ output.toString());
    }

    public void usingHashSet(){
        String input = "PRRRRRRRRRRRRAAAAAAAAAAAAAAAAAAAATTTTTTTTTTTTTTTIIIIIIIIIKKKKKK";
        char[] a=input.toCharArray();

        HashSet <Character> obj=new HashSet<>();
        for(char x:a){
            obj.add(x);
        }

        System.out.println("String aftr removing duplicates"+obj.toString());

    }


    public static void main(String[] args){
        removeDuplicateFromStr obj = new removeDuplicateFromStr();
        // obj.removeDuplicateLogic();
        obj.usingHashSet();
    }
    
}
