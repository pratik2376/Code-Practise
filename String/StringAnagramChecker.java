import java.util.Arrays;

public class StringAnagramChecker {

    public void logic(){

        boolean isStringAnagram = false;

        String input = "apple";
        String input2 = "apale";

        if(input.length() == input2.length()){
            isStringAnagram=true;
        }

        if(isStringAnagram){
            String[] a= input.split("");
            String[]b =input2.split("");

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a,b)){
                isStringAnagram=true;
            }
            else{
                isStringAnagram=false;
            }
        
        }
        System.out.println("The given two strings are anagram this statement is - "+ isStringAnagram);


    }
    public void logic2(){
        String input1 = "madam";
        String input2 = "adamm";

        if(input1.length() == input2.length()){
            char[] a = input1.toCharArray();
            char[] b = input2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Srings are not anagram");
            }


        }
        else{
            System.out.println("String is not anagram");
        }
    }


    public static void main(String[] args){
        StringAnagramChecker obj = new StringAnagramChecker();
        obj.logic2();
    }
    
}
