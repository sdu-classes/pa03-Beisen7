public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(7,8);
        Calculator calculator1 = new Calculator(9,0);
        Calculator calculator2 = new Calculator(-5,7);
        Calculator calculator3 = new Calculator(7,-8);
        calculator.Add();
        calculator1.Multiplication();
        calculator2.Subtract();
        calculator3.Division();
    }
}
