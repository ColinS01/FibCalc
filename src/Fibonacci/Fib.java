package Fibonacci;

public class Fib {
    public static int[] fibFalc(int length){
        int fib[] = new int[length];
        int num1 = 0;
        int num2 = 1;
        int placeValue;

        for (int i = 0; i < length; i++) {
            placeValue = num1 + num2;
            fib[i] = placeValue;
            num1 = num2;
            num2 = placeValue;
        }

        return fib;
    }
}
