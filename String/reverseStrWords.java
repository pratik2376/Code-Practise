public class reverseStrWords {

    public void reverseWordLogic(){

        String input = "This is a smaple program";

        String[] split = input.split(" ");
        
        
        System.out.print("Reverse string is - " );
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i] + " ");

        }

    }

public void reverseEachWordContent(){
    String input = "My name is Test";

    String[] array = input.split("\\s");

    StringBuilder output = new StringBuilder();

    System.out.println("Array length is "+array.length);


    for(String a:array){
        String result = new StringBuilder(a).reverse().toString();
        output.append(result+" ");
    }
    

    System.out.println("Reversed words are - "+output.toString());
}

    public static void main(String[] args){
        reverseStrWords obj = new reverseStrWords();
        obj.reverseWordLogic();
        // obj.reverseEachWordContent();
    }
    
}
