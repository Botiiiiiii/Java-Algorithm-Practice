package algo_exercise.Search;

public class ExhaustiveSearch {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] firstStudent = {1,2,3,4,5};
        int[] secondStudent = {2,1,2,3,2,4,2,5};
        int[] thirdStudent = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == firstStudent[i%5]){
                cnt[0] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == secondStudent[i%8]){
                cnt[1] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == thirdStudent[i % 10]) {
                cnt[2] += 1;
            }
        }
        int max = cnt[2];
        for (int i = 0; i < 2; i++) {
            if(cnt[i] > max){
                max = cnt[i];
            }
        }
        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            if (max == cnt[i]){
                answer[tmp] = i+1;
                tmp ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ExhaustiveSearch exhaustiveSearch = new ExhaustiveSearch();
        int[] answers = {1,2,3,4,5};
        exhaustiveSearch.solution(answers);
    }
}
