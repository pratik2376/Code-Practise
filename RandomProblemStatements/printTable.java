package RandomProblemStatements;

import java.util.Scanner;

public class printTable {

    public void logic(){
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int table = 0;
        System.out.println("The table is - " );
        for(int i=1;i<=10;i++)
        {
            table = number * i;
            System.out.println( table);
        }
        obj.close();

    }

    public static void main(String args[]){
        printTable obj2 = new printTable();
        obj2.logic();
    }
    
}
