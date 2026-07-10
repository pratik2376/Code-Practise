package RandomProblemStatements;

public class swap2NumbersWithAndWithout3rdNumber {
    public void logic(){
        int a =3;
        int b=4;
        int c;

        c = a;
        a=b;
        b=c;

        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
    public void without3rdNumber(){
        int a=3;
        int b=4;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        swap2NumbersWithAndWithout3rdNumber obj = new swap2NumbersWithAndWithout3rdNumber();
        obj.without3rdNumber();
    }
    
}
