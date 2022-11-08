package algo_exercise.Sort;

import java.util.Scanner;

public class SimpleSearch {
    public int solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i] == find) return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        SimpleSearch simpleSearch = new SimpleSearch();
        System.out.println(simpleSearch.solution());
    }
}
