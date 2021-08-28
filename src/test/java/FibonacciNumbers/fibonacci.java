package FibonacciNumbers;

public class fibonacci {
    static int fibonacсiNum(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonacсiNum(n - 1) + fibonacсiNum(n - 2);
        }
    }

    public static void main(String[] args){
        System.out.println(fibonacсiNum(11));
    }
}
