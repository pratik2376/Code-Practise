package RandomProblemStatements;

public class convertStringToExpectedPattern {
   public void logic(){
    String input = "pra7 ti2k auto4m 6mation";
    int firstSpace = input.indexOf(" ");

    String firstWord = input.substring(0, firstSpace);

    String remaining = input.substring(firstSpace + 1);

    String result = remaining + " " + firstWord;

    System.out.println(result);
   } 

public static void main(String[] args) {
    convertStringToExpectedPattern obj2 = new convertStringToExpectedPattern();
    obj2.logic();
}


   
}
