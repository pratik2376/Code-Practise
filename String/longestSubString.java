import java.util.HashSet;

public class longestSubString {

    public void longSubString(){
        String a = "abcccbb";

        int left = 0;
        int maxCount = 0;

        HashSet <Character> obj = new HashSet<>();

        for(int right = 0; right<a.length();right++){

            while(obj.contains(a.charAt(right))){
                obj.remove(a.charAt(left));
                left++;
            }
            obj.add(a.charAt(right));
            maxCount = Math.max(maxCount,right-left+1);

        }
        System.out.println("The substring is - ");
        System.out.println(obj.toString());
        System.out.println("The length is - ");
        System.out.println(maxCount);
    }
    public static void main(String[] args){
        longestSubString obj2 = new longestSubString();
        obj2.longSubString();
    }
    
}
