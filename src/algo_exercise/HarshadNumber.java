package algo_exercise;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int tmp;
        tmp = x;
        while(tmp != 0){
            sum += tmp%10;
            tmp /= 10;
        }
        return x%sum == 0;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        System.out.println(harshadNumber.solution(11));
    }
}
