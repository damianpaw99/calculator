public class CalculatorLauncher {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.addition(1,2));
        System.out.println(c.subtraction(4,3));
        System.out.println(c.multiplication(2,3));
        System.out.println(c.division(6,3));
        System.out.println(c.power(2,3));
    }
}
