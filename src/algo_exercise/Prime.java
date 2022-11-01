package algo_exercise;

public class Prime {
    public boolean isPrime1(int num){ // 1 ~ num-1까지 모든 수 나누기 연산 진행
        for (int i = 2; i < num; i++) {
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }

//    public boolean isPrime2(int num){
//        int len = num / 2;
//        for (int i = 0; i < len; i++) {
//
//        }
//    }

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime1(12));

    }
}
