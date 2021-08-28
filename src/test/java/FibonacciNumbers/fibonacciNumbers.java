package FibonacciNumbers;

public class fibonacciNumbers {

    public static void main(String[] args){
        int numFirst = 1;
        int numSecond = 1;
        int sum;
        System.out.print(numFirst + " " + numSecond + " ");
        for(int i = 3; i <= 11; i++){
            sum = numFirst+numSecond;
            System.out.print(sum + " ");
            numFirst = numSecond;
            numSecond = sum;
        }
        System.out.println();
    }
}
