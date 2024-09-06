public class replaceSpaceInstr {

    public void replaceLogic(){

        String input = "pratik Holkar";

        String output = input.replace(' ', '@');

        System.out.println("Replaced String is - "+output);

    }

    public static void main(String[] args){
        replaceSpaceInstr obj =new replaceSpaceInstr();
        obj.replaceLogic();
    }
    
}
