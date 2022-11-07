package algo_exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class DividedArray {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) answer.add(arr[i]);
        }
        int[] answer_list = new int[answer.size()];

        for (int i = 0; i < answer_list.length; i++) {
            answer_list[i] = answer.get(i);
        }

        return answer_list;
    }

    public static void main(String[] args) {
        DividedArray dividedArray = new DividedArray();
        System.out.println(dividedArray.solution([5, 9, 7, 10],5));
    }
}
