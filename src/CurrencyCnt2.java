

public class CurrencyCnt2 {
    public static void main(String[] args) {
        System.out.print("금액을 넣으세요:");

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 50;


        int total = 25000;

        System.out.printf("5만원권%d장 나머지:%d\n",total/curr50000, total % curr50000);
        total %= 50000;
        System.out.printf("1만원권%d장 나머지:%d\n",total/curr10000, total % curr10000);
        total %= 10000;
        System.out.printf("5천원권%d장 나머지:%d\n",total/curr5000, total % curr5000);
        total %= 5000;
        System.out.printf("1천원권%d장 나머지:%d\n",total/curr1000, total % curr1000);
        total %= 1000;
        System.out.printf("5백원%d개 나머지:%d\n",total/curr500, total % curr500);
        total %= 500;
        System.out.printf("1백원%d개 나머지:%d\n",total/curr100, total % curr100);
        total %= 100;
        System.out.printf("50원%d개 나머지:%d\n",total/curr50, total % curr50);
        total %= 50;
        System.out.printf("10원%d개 나머지:%d\n",total/curr10, total % curr10);

    }
}
