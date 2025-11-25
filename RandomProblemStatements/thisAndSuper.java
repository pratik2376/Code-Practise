package RandomProblemStatements;

class a{
    int a=20;
    a(){
        System.out.println("Hello a");
    }

}

public class thisAndSuper extends a {

    int a =10;

    public thisAndSuper(){
        super(); //hidden which will call constructor of parent class.
        System.out.println("hello thisSuper");
        System.out.println(super.a);
    }

    public thisAndSuper(int a){
        this(); //call constructor of same class.
        System.out.println("hello thisSuper int");
        System.out.println(this.a);
        
    }


    public static void main(String args[]){
        thisAndSuper obj = new thisAndSuper(5);
    }
    
}


