public class removeSpaceInstring {

    public void removSpaceLogic(){

        String input = "Hello World how Are you   is";

        String output = input.replaceAll("\\s", "");
        System.out.println("Final String is: "+" "+output);

    }

    public static void main(String[] args){
        removeSpaceInstring obj = new removeSpaceInstring();
        obj.removSpaceLogic();
    }
    
}