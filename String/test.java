import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public void logic(){

        String input = "AXXXsss";

        int count=0;

        Pattern obj = Pattern.compile("[A-Z]");
        Matcher obj2 = obj.matcher(input);

        while(obj2.find()){
            count ++;
        }

        System.out.println("Count is "+count);

    }

    public void logic2(){
        String input = "dsbdsjf";

        int count = input.length();

        System.out.println("The length is "+count);
    }

    public void logic3(){
        String input = "Hello World";

        int count = 0;

        char[] ip = input.toCharArray();
        ArrayList <Character> obj = new ArrayList<>();

        for(char x:ip){
            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u'){
                count++;
                obj.add(x);
            }
        }
        System.out.println("The vowels are "+obj);
        System.out.println("The count of vowels is "+count);
    }

    public void logic4(){
        String input = "tessttt";

        char[] ip = input.toCharArray();
        HashMap <Character, Integer> obj = new HashMap<>();
        System.out.println("Vharacter with count = ");
        for(char x:ip){
            if(obj.containsKey(x)){
                obj.put(x, obj.get(x)+1);
            }
            else{
                obj.put(x, 1);
            }
        }
        System.out.println(obj);
        for(Map.Entry<Character, Integer> entry :obj.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicates are - "+entry.getKey());
            }
        }

    }

    public void logic5(){

        Scanner obj = new Scanner(System.in);

        String input = obj.nextLine();

        String[] string = input.split("\\s");

        StringBuilder obj2 = new StringBuilder();

        for(String x :string){
            obj2.append(x.substring(0, 1).toUpperCase());
            obj2.append(x.substring(1).toLowerCase());
            obj2.append(" ");
        }

        System.out.println("The out put is "+obj2.toString());


    }

    public static void main(String[] args)
    {
        test obj = new test();
        obj.logic5();
    }
    
}
