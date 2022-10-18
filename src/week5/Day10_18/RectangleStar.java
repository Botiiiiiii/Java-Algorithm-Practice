package week5.Day10_18;

public class RectangleStar {
    void printRectangle(int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new RectangleStar().printRectangle(4,5);
    }
}
