package Week3;

public class CalculatorMain {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator cal = new Calculator();
        cal.plus(num1,num2);
        cal.minus(num1,num2);
        cal.multiple(num1,num2);
        cal.divide(num1,num2);
    }
}
