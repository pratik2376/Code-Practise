public class replaceSpaceInstr {

    public void replaceLogic(){

        String input = "pratik Holkar test";

        String output = input.replaceAll("\\s", "@");

        System.out.println("Replaced String is - "+output);

    }

    public static void main(String[] args){
        replaceSpaceInstr obj =new replaceSpaceInstr();
        obj.replaceLogic();
    }
    
}
