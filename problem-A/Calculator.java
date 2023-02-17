public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Add(){
        if(a < 0 || b < 0) throw new ArithmeticException("Numbers should be positive");
        return a + b;
    }

    public int Subtract(){
        if(a < 0 || b < 0) throw new ArithmeticException("Numbers should be positive");
        return a - b;
    }

    public int Division(){
        if(a == 0 || b == 0) throw new ArithmeticException("Numbers should not be zero");
        return  a/b;
    }
    public int Multiplication(){
        if(a == 0 || b == 0) throw new ArithmeticException("Numbers should not be zero");
        return  a*b;
    }

}
