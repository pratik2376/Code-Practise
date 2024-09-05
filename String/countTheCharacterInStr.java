public class countTheCharacterInStr {

    public void charCountLogic(){
        int count = 1;
        String input = "asscccddd";
       
        int c = input.length();
        System.out.println("String length is - "+ " "+c);
    }
    public static void main(String[] args) {
        countTheCharacterInStr obj = new countTheCharacterInStr();
        obj.charCountLogic(); 
    }
    
}
