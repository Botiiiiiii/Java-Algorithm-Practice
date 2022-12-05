package algo_exercise.Heap;

import java.util.Arrays;

public class MakeHeap {

    public static int[] childIdx(int parentIdx){
        return new int[]{2 * parentIdx + 1, 2 * parentIdx + 2};
    }

    public static void main(String[] args) {
        int[] arr = {6,5,7,8};
        System.out.println(Arrays.toString(arr));


        // 8과 5
        int tmp = arr[1];
        arr[1] = arr[3];
        arr[3] = tmp;

        //8과 6
        tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

        System.out.println(Arrays.toString(arr));

    }
}
