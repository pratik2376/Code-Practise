package RandomProblemStatements;
import java.util.Scanner;

public class sumOfNumbers {

    public void logic(){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            System.out.println(i);
            sum = sum+i;

        }

        System.out.println("The sum is - "+sum);
        obj.close();
    }

    public static void main(String args[]){
        sumOfNumbers obj2 = new sumOfNumbers();
        obj2.logic();
    }
    
}
