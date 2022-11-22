package algo_exercise.recursion;

public class OneToH {
    public void recursion(int i){
        if (i == 101)
            return;
        System.out.println(i);
        recursion(i+1);
    }

    public static void main(String[] args) {
        OneToH oneToH = new OneToH();
        oneToH.recursion(1);
    }
}
