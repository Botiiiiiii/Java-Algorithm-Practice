package week5.Day10_17;

import java.util.Scanner;

public class RightTriangle {
    void print(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        rightTriangle.print(n);
    }
}
