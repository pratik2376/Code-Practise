import java.util.Scanner;

public class FirstLetterCapital {

    public void logic(){
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();

       String[] obj = input.split("\\s");

       StringBuilder obj2 = new StringBuilder();

       for(String a:obj){
        obj2.append(a.substring(0, 1).toUpperCase());
        obj2.append(a.substring(1).toLowerCase());
        obj2.append(" ");
       }

       System.out.println("Final String is - "+obj2.toString());

    }

    public static void main(String[] args) {
        FirstLetterCapital obj = new FirstLetterCapital();
        obj.logic();
    }
    
}
