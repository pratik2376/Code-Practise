package HashMap;

import java.util.HashMap;

public class countNumberOfWordsOccurance {

    public void countWordsOcc()
    {
        HashMap<String, Integer> obj = new HashMap<>();

        String line = "Hello world I am world Hello";

        String[] words = line.split(" ");

        for(String word: words){
            if(obj.containsKey(word)){
                obj.put(word, obj.get(word)+1);
            }
             else{
            obj.put(word,  1);
            }
        }

        String maxWord = "";
        int maxCount = 0;

        for(String word: obj.keySet()){
            if(obj.get(word)>maxCount){
                maxCount=obj.get(word);
                maxWord=word;
            }

        }
        System.out.println(obj.toString());
        System.out.println("Highest word: " + maxWord);
        System.out.println("Count: " + maxCount);
    }

    public void logic(){
        String input = "Hello world how are you world";

        String[] words = input.split(" ");
        HashMap<String, Integer> obj = new HashMap<>();

        for(String word: words){
            if(obj.containsKey(word)){
                obj.put(word, obj.get(word)+1);
            }
            else{
                obj.put(word, 1);
            }

        }
        System.out.println("Count of words - "+obj.toString());
    }

    public static void main(String[] args) {
        countNumberOfWordsOccurance obj2 = new countNumberOfWordsOccurance();
        obj2.logic();
    }
    
}
