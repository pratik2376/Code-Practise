import java.util.ArrayList;
import java.util.HashSet;

public class removeCharFromFirstStr {

    public void removeLogic(){

        String input = "How are you";
        String input2 = "How";

        // char[] input1 = input.toCharArray();
        // char[] charinput2 = input2.toCharArray();
        // StringBuilder output = new StringBuilder();

    //    Boolean isDuplicate = false;
HashSet<Character> obj2= new HashSet();
    ArrayList<Character> charList = new ArrayList<>();


        for(int i=0;i<input.length();i++){
            Boolean isDuplicate = false;
            for(int j=0;j<input2.length();j++){
                if(input.charAt(i) == input2.charAt(j)){
                    isDuplicate = true;
                  char currentChar = input2.charAt(j);
                  obj2.add(currentChar);
                }
            }
        }

        System.out.println("Final String is - "+charList);

    }
    

    public static void main(String[] args){
        removeCharFromFirstStr obj = new removeCharFromFirstStr();
        obj.removeLogic();
    }
    
}
