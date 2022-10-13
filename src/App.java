import Fibonacci.Fib;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            int length = Integer.parseInt(args[0]);
            int fib[] = Fib.fibFalc(length);

            for (int a : fib){
                System.out.print(a + " ");
            }
        }catch (Exception e){
            System.out.println("Must be number greater than 0");
        }
        


    }
}
