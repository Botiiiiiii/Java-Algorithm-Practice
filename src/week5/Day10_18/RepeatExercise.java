package week5.Day10_18;

public class RepeatExercise {
    public void printSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new RepeatExercise().printSquare(4);
    }
}
