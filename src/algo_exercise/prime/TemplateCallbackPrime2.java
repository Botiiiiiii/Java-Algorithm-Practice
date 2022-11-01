package algo_exercise.prime;
//익명 내부클래스 사용방법
interface StatementStrategy2{
    boolean compare(int a, int b);
}
public class TemplateCallbackPrime2 {

    boolean isPrime(int num, StatementStrategy2 stmt){
        for (int i = 2; stmt.compare(i,num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime2 tcp = new TemplateCallbackPrime2();
        System.out.println(tcp.isPrime(17, (a,b) -> a<b));
        System.out.println(tcp.isPrime(13, (a,b) -> a<b/2));
        System.out.println(tcp.isPrime(15, (a,b) -> a*a<b));
    }
}
