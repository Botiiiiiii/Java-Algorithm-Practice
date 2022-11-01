package algo_exercise;

public class Prime {
    public boolean isPrime(int num){
        int cnt = 0;
        for (int i = 1; i < num; i++) {
            if(num%i ==0){
                cnt++;
            }
        }
        return cnt == 1;
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime(12));
    }
}
