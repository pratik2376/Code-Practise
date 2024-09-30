import java.util.Stack;

public class StrReverseUsingStack {
    public void logic(){

    String input ="Hello";

    char[] ch = input.toCharArray();

    StringBuilder obj = new StringBuilder();

    Stack <Character> stack = new Stack ();

    for(char x:ch){
        stack.push(x);
    }

    while(!stack.isEmpty()){

        obj.append(stack.pop());
    }

    System.out.println("The reversed string using stack is - "+ obj);


    }

    public static void main(String[] args){
        StrReverseUsingStack obj = new StrReverseUsingStack();
        obj.logic();
    }
}
