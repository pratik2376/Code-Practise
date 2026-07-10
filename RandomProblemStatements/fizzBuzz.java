package RandomProblemStatements;

public class fizzBuzz {

    public void fb(){
        for(int i=1;i<10;i++)
        {
            if(i%3==0 && i%5==0){
                System.out.println("the number is fizzbuz");

            }
            else if(i%3==0){
                System.out.println("the number is fizz");

            }
            else if (i%5==0){
                System.out.println("The number is buzz");
            }
            else{
                System.out.println("The number is normal");
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz obj = new fizzBuzz();
        obj.fb();
    }
    
}
