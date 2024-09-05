public class fibonanciSeries {

    public void fibonanciSeriesLogic(){ //0,1,1,2,3,5

        long a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            long nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    public static void main(String[] args){
        fibonanciSeries obj = new fibonanciSeries();
        obj.fibonanciSeriesLogic();
    }
    
}
