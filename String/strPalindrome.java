public class strPalindrome {
    
    public void strPalindromeChk(){

        String input = "madam";

        String result = new StringBuilder(input).reverse().toString();

        if(input.equals(result)){
            System.out.println("String is palindrome");
        }

        else{
            System.out.println("String is not palindrome");
        }

    }

    public void strPalindromeChkWithForLoop(){
        String input = "madam";

        String result = "";

        for(int i=input.length()-1; i>=0; i--){
            result+=input.charAt(i);
        }

        if(input.equals(result)){
            System.out.println("String is palindrome");
        }

        else{
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args){

        strPalindrome obj = new strPalindrome();
        obj.strPalindromeChk();
        obj.strPalindromeChkWithForLoop();


    }
}
