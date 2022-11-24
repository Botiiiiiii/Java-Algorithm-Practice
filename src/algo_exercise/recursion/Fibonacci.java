package algo_exercise.recursion;

public class Fibonacci {
    public int solution(int num){
        if (num == 1 || num == 2)
            return 1;
        return solution(num -1) + solution(num - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.solution(0));
    }
}
