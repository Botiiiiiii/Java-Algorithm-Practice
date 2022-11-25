package algo_exercise.recursion;

public class Gcd {
    public static int gcd(int a, int b){
        if (a == b)
            return a;
        if (a  > b)
            return gcd(a-b,b);
        if (a < b)
            return gcd(a,b - a);
        return 1;
    }

    public static void main(String[] args) {
        int result;
        result = gcd(196,42);
        System.out.println(result);
    }
}
