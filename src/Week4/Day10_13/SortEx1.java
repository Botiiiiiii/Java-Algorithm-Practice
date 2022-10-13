package Week4.Day10_13;

import java.util.Arrays;

public class SortEx1 {

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j ++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SortEx1 test = new SortEx1();
        int[] arr = {7,2,3,9,28,11};

        System.out.println(Arrays.toString(test.sort(arr)));

    }

}
