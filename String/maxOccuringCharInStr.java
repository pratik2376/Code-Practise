import java.util.HashMap;
import java.util.Map;

public class maxOccuringCharInStr {

    public void maxOccuringLogic(){

        String input = "Prraatikkk";
        char[] abc = input.toCharArray();

        StringBuilder obj = new StringBuilder();
        Boolean isDuplicate = false;
        HashMap<Character,Integer> obj2 = new HashMap<>();

        for(int i=0;i<abc.length;i++){
            int count = 1;
            for(int j=0; j<i;j++){
                if(abc[i] == abc[j]){
                    isDuplicate = true;
                    count++;
                    obj2.put(abc[i], count);
                }
            }
        }
        System.out.println("hashmap - "+obj2);
        char maxChar = '\0';
        int maxCount = -1;

        for (Map.Entry<Character, Integer> entry : obj2.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("The character which is having highest count is - "+ maxChar+ " "+ "with count "+ maxCount );

    }

    public static void main(String[] args){
        maxOccuringCharInStr obj =new maxOccuringCharInStr();
        obj.maxOccuringLogic();
    }
    
}
