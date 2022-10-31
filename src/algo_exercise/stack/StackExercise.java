package algo_exercise.stack;

import java.util.Stack;

public class StackExercise {

    public boolean solution(String s){ // 스택없이 문제 풀기
        while (s.indexOf("()") >= 0) {
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

    public boolean solution_stack(String s){ // 스택으로 문제 풀기
        Stack<Character> st = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            if ('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if (')' == s.charAt(i)){
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }

}
