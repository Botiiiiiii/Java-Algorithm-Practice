package algo_exercise.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack03 {
    public int[] solution(int []arr) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                answerList.add(arr[i]);
            }
            else{
                if (arr[i] != arr[i-1])
                    answerList.add(arr[i]);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Stack03 stack03 = new Stack03();
        int[] pratice = new int[]{1, 1, 3, 3, 0, 1, 1};
        stack03.solution(pratice);
    }
}
