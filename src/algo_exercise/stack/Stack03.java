package algo_exercise.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stack03 {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(st.peek() != arr[i]) st.push(arr[i]);
        }
        System.out.println(st);
        int[] answer = new int[st.size()];

        for (int i = st.size() -1 ; i >= 0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Stack03 stack03 = new Stack03();
        int[] pratice = new int[]{1, 1, 3, 3, 0, 1, 1};
        stack03.solution(pratice);
    }
}
