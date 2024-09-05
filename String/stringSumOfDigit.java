import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringSumOfDigit {

    public void sumDigit(){

        String input = "He2345 How 0123";

        //To define a patter \\d is used to check the digit in string.

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        int sum =0;

        while(matcher.find())
        {
            String strdDigit = matcher.group();
            int digit = Integer.parseInt(strdDigit);
            sum = sum+digit;

        }
        System.out.println("The sum of individual number is =" + sum);

    }

    public static void main(String[] args)
    {
        stringSumOfDigit obj = new stringSumOfDigit();
        obj.sumDigit();
    }
}