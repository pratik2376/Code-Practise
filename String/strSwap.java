public class strSwap {

    public void swapString(){

        String input1 = "Pratik";
        String input2 = "Holkar";

        int inputLength1 = input1.length();
        int inputLength2 = input2.length();

        String input3 =input1+input2;
        input1= new StringBuilder(input3).delete(0, inputLength1).toString();
        input2 = new StringBuilder(input3).substring(0, inputLength1).toString();
        System.out.println("Here are the swapped strings : Input1 value = "+" "+input1 +" "+" And input2 value = "+ " "+ input2);
    }

    public static void main(String[] args){
        strSwap obj = new strSwap();
        obj.swapString();
    }
    
}
