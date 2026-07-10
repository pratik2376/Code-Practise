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

    public void logic2(){

        int a = 1234;
        int sum = 0;

        while(a!=0){
            sum = sum + a%10;
            a = a/10;

        }

        System.out.println("the sum is - "+ sum);
    }

    public void logic3(){

        String input = "1234";

        int a = Integer.parseInt(input);

        int sum = 0;

        while(a!=0){
            sum=sum+a%10;
            a=a/10;
        }

        System.out.println("the sum is - "+sum);
    }

    public static void main(String args[]){
        sumOfNumbers obj2 = new sumOfNumbers();
        obj2.logic3();
    }
    
}
