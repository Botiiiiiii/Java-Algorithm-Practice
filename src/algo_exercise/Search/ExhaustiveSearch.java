package algo_exercise.Search;

public class ExhaustiveSearch {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int tmp = 1;
        int fistStudent = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == tmp%6){
                fistStudent += 1;
            }
            tmp++;
        }

        System.out.println(fistStudent);


        return answer;
    }

    public static void main(String[] args) {
        ExhaustiveSearch exhaustiveSearch = new ExhaustiveSearch();
        int[] answers = {1,2,3,4,5};
        exhaustiveSearch.solution(answers);
    }
}
