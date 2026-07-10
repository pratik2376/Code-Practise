public class CheckSringContainsOnlyDigits {

    public void logic(){
        String input = "123s4";
        boolean flag = true;

        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                flag=false;
                break;

            }

        }
        if (flag){
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String contains non digits");

        }
    }

    public static void main(String[] args) {
        CheckSringContainsOnlyDigits obj = new CheckSringContainsOnlyDigits();
        obj.logic();
    }
    
}
