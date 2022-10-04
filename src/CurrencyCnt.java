import java.util.Scanner;

public class CurrencyCnt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int total = in.nextInt();

        int[] Moneytype = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int i = 0 ; i < Moneytype.length ; i ++) {
            int num = total / Moneytype[i];
            total %= Moneytype[i];
            System.out.printf("%d원%d개\n",Moneytype[i],num);
        }





        in.close();
    }
}
