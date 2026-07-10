package RandomProblemStatements;

public class factorialOfANumber {
    public void logic(){
        int num = 5;
        int fact = 1;

        for(int i=1;i<=num;i++){
            fact = fact*i;
        }

        System.out.println("Factorial of a number is - "+fact);
    }

    public static void main(String[] args) {
        factorialOfANumber obj = new factorialOfANumber();
        obj.logic();
    }

    
}
