package CalculateFactorialRecursion;

public class factorialRecursion {
    public static int calculateFactorialRecursion(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * calculateFactorialRecursion(f - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(calculateFactorialRecursion(4));
    }
}
