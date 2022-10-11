package Week4.Day10_11;

public class SumOfDigit {
    private int sum;

    public SumOfDigit() {
        this.sum = 0;
    }

    public int solution(int num){


        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
