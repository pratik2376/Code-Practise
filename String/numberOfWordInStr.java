public class numberOfWordInStr {

    public void logicTocalculateNumberOfWords(){

        String input = "I am learning new things";
        int count = 1;

        for(int i=0; i<input.length()-1;i++){
            if((input.charAt(i)==' ')&& (input.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("The word count is - " + count);
    }
    
    public static void main(String[] args){
        numberOfWordInStr obj = new numberOfWordInStr();
        obj.logicTocalculateNumberOfWords();
    }
}
