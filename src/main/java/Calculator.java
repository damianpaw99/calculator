public class Calculator {
    public int addition(int x, int y){
        return x+y;
    }
    public int subtraction(int x, int y){
        return x-y;
    }
    public int multiplication(int x, int y){
        return x*y;
    }
    public double division(int x, int y){
        try {
            return (double) x / y;
        } catch (ArithmeticException e){
            e.getStackTrace();
            return Double.NaN;
        }
    }
}
