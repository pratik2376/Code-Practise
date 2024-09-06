public class swap2StrWithoutThirdStr {  
   public void swapLogic(){

    String input = "Pratik";
    String input2 = "Holkarss";

    input = input + input2;

    System.out.println("input is - "+input);
    input2 = input.substring(0,input.length()-input2.length());
    input = input.substring(input2.length());

    System.out.println("After swapping  -  "+ input + " "+ input2);

   }

   public static void main(String[] args){
    swap2StrWithoutThirdStr obj = new swap2StrWithoutThirdStr();
    obj.swapLogic();
   }
} 