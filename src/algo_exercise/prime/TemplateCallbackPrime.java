package algo_exercise.prime;

public class TemplateCallbackPrime {
    boolean Operation(int a, int b){
        return a<b;
    }

    boolean isPrime(int num){
        for (int i = 2; Operation(i,num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime = new TemplateCallbackPrime();
        boolean r = templateCallbackPrime.isPrime(10);
        System.out.println(r);
    }
}
