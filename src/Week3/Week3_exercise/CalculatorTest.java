package Week3.Week3_exercise;

public class CalculatorTest {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new SpecificNumberGenerator();
        NumberGenerator numberGenerator2 = new RandomNumberGenerator();

        Calculator specificCalculator = new Calculator(numberGenerator);
        Calculator randomCalculator = new Calculator(numberGenerator2);

        specificCalculator.plus();
        randomCalculator.plus();
    }
}
