package algo_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DividedArray {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸고
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // sort 한 것을 리턴
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        DividedArray dividedArray = new DividedArray();
        int[] arr = {5,9,7,10};
        System.out.println(Arrays.toString(dividedArray.solution(arr, 5)));
    }
}
