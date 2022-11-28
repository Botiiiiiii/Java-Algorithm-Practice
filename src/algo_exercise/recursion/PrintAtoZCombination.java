package algo_exercise.recursion;

public class PrintAtoZCombination {
    public static void printAlphabet(char c) {
        if (c > 'Z') return;
        System.out.println(c); // String + char
        printAlphabet((char)(c + 1));
    }
    public static void main(String[] args) {
        printAlphabet('A');
    }

}
