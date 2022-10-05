package Week3;

public class CalculatorMain {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator cal = new Calculator();
        System.out.println(cal.plus(num1,num2));
        System.out.println(cal.minus(num1,num2));
        System.out.println(cal.multiple(num1,num2));
        System.out.println(cal.divide(num1,num2));
    }
}
