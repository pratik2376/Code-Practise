package RandomProblemStatements;

public class checkNumberIsPalindrome {

    public void logic(){
        int num = 121;
        int rev = 0;
        int originalNum = num;

        while(num!=0){
        int digit = num % 10; //This is to get last digit
        rev = rev*10+digit;  // This is to store last digit
        num = num/10;        //This is to remove last digit
        }

        if (originalNum == rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        
    }
    public static void main(String[] args) {
    checkNumberIsPalindrome obj = new checkNumberIsPalindrome();
    obj.logic();
    }
   
    
}
