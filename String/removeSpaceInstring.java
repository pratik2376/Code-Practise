public class removeSpaceInstring {

    public void removSpaceLogic(){

        String input = "Hello World how Are you   ";

        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==' '){
                input = new StringBuilder(input).deleteCharAt(i).toString();
            }
        }
        System.out.println("Final String is: "+" "+input);

    }

    public static void main(String[] args){
        removeSpaceInstring obj = new removeSpaceInstring();
        obj.removSpaceLogic();
    }
    
}