package week5.Day10_17;

public class PyramidTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
