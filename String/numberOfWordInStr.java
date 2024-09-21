public class numberOfWordInStr {

    public void logicTocalculateNumberOfWords(){

        String input = "hello how are you";
        int count = 0;

        String[] words =input.split("\\s");
        int wordCount=input.isEmpty()?0:words.length;

        System.out.println("The word count is - " + wordCount);
    }
    
    public static void main(String[] args){
        numberOfWordInStr obj = new numberOfWordInStr();
        obj.logicTocalculateNumberOfWords();
    }
}
