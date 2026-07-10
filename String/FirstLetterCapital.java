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

    public void practise(){
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] obj = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String s:obj){
            sb.append(s.substring(0, 1).toUpperCase());
            sb.append(s.substring(1).toLowerCase());
            sb.append(" ");
        }

        System.out.println("final output - "+sb.toString());
    }

    public void logic2(){

        String input = "hellow World I am pratik";

        String[] words = input.split(" ");

        StringBuilder obj = new StringBuilder();

        for(String a:words){
            obj.append(a.substring(0, 1).toUpperCase());
            obj.append(a.substring(1).toLowerCase());
            obj.append(" ");
        }

        System.out.println("output is - "+obj.toString());

    }

    public static void main(String[] args) {
        FirstLetterCapital obj = new FirstLetterCapital();
        obj.logic2();
    }
    
}
