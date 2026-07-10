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

    public void checkPalindrom(){
        String abc = "madam";
        String def = new StringBuilder(abc).reverse().toString();

        if(abc.equals(def)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }

    public void checkPalindrom2(){
        String aa = "madam";
        String bb = "";

        for(int i=aa.length()-1;i>=0;i--){
            bb = bb+aa.charAt(i);
        }
        if(aa.equals(bb)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args){

        strPalindrome obj = new strPalindrome();
        // obj.strPalindromeChk();
        // obj.strPalindromeChkWithForLoop();

        obj.checkPalindrom2();


    }
}
