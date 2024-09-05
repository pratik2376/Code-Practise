import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class serateOutCharAndNumFrmStr {

    public void seperationOfNumberChar()
    {
        String input = "Hi@#$%ssd12345 awss@ 23";


        Pattern pattern = Pattern.compile("\\d");
        Pattern pattern2 = Pattern.compile("[a-zA-Z]");
        Pattern pattern3 = Pattern.compile("[^a-zA-Z0-9]");

        Matcher matcher = pattern.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        Matcher matcher3 = pattern3.matcher(input);

        System.out.println("Numbers are: ");
        while (matcher.find()) 
        {

            System.out.println(matcher.group()+ " ");
            
        }

        System.out.println("Characters are: ");
        while (matcher2.find()) 
        {

            System.out.println(matcher2.group()+ " ");
            
        }

        System.out.println("Special Characters are: ");
        while (matcher3.find()) 
        {

            System.out.println(matcher3.group()+ " ");
            
        }
    }

    public static void main(String[] args){

        serateOutCharAndNumFrmStr obj = new serateOutCharAndNumFrmStr();
        obj.seperationOfNumberChar();
            
    }
    
}
