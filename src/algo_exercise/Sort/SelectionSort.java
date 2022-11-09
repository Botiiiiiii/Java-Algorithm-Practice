package algo_exercise.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        int tmp;
        int min;
        int minidx;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minidx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    minidx = j;
                }
            }
            if (minidx != i){
                tmp = arr[minidx];
                arr[minidx] = arr[i];
                arr[i] = tmp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
