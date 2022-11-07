package algo_exercise;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        System.out.println(sum);
        return true;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        harshadNumber.solution(10);
    }
}
