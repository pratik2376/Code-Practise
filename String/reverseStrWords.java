public class reverseStrWords {

    public void reverseWordLogic(){

        String input = "This is a smaple program";

        String[] split = input.split(" ");
        
        
        System.out.print("Reverse string is - " );
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i] + " ");

        }

    }

    public static void main(String[] args){
        reverseStrWords obj = new reverseStrWords();
        obj.reverseWordLogic();
    }
    
}
