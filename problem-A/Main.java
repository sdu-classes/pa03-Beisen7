public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(7,8);
        Calculator calculator2 = new Calculator(9,0);
        Calculator calculator3 = new Calculator(-5,7);
        Calculator calculator4 = new Calculator(7,-8);
        calculator1.Add();
        calculator2.Multiplication();
        calculator3.Subtract();
        calculator4.Division();
    }
}
