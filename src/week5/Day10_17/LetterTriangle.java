package week5.Day10_17;

import java.util.Scanner;

public class LetterTriangle {
    private String letter="#";

    public LetterTriangle() {
    }

    void print(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(this.letter);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        LetterTriangle lettertriangle = new LetterTriangle();
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        lettertriangle.print(n);
    }
}
