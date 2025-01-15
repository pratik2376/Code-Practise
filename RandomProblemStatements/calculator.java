package RandomProblemStatements;

import java.util.Scanner;

public class calculator {

    public void logic(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First number");
        int a = obj.nextInt();
        System.out.println("Enter Second number");
        int b = obj.nextInt();


        System.out.println("Please enter a value based on the operation you want to perform - ");

        System.out.println("Operations are - \nPress 1 for :(Addition)\n"  + 
                        "Press 2 for : - (Subtraction)\n" + //
                        "Press 3 for  : * (Multiplication)\n"+ //
                        "Press 4 for : / (Division)\n" + //
                        "Press 5 for  : % (Modulo or remainder)\n" + //
                        "");
        int c = obj.nextInt();
        
        switch (c) {
            case 1: 
            int sum = a+b;
                System.out.println("The addition of 2 numbers is "+ sum);
                break;
            case 2:
            int difference = a-b;
                System.out.println("The substraction of 2 numbers is "+ difference);
            break;
            case 3:
            int multiplication = a*b;
                System.out.println("The substraction of 2 numbers is "+ multiplication);
            break;
            case 4:
            int division = a/b;
                System.out.println("The division of 2 numbers is "+ division);
            break;
            case 5:
            int modular = a%b;
                System.out.println("The modular of 2 numbers is "+ modular);
            break;
            default:
            System.out.println("Sir ji you have provided out of box input");
        }
        obj.close();

    }
    public static void main(String args[]){
        calculator obj2 = new calculator();
        obj2.logic();
    }
    
}
