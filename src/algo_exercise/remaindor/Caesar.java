package algo_exercise.remaindor;

public class Caesar {
    public String solution(String s, int n){
        StringBuilder answer = new StringBuilder();
        int charnum = 0;
        for (int i = 0; i < s.length(); i++) {
            charnum = (int)s.charAt(i);
            int addcharnum = (charnum + n);
            if (charnum >= 65 && charnum <= 90) {
                if (addcharnum > 90)
                    addcharnum = addcharnum - 26;
                answer.append(String.valueOf((char) (addcharnum)));

            }
            else if (charnum >= 97 && charnum <= 122){
                if (addcharnum > 122)
                    addcharnum = addcharnum - 26;
                answer.append(String.valueOf((char) (addcharnum)));
            }
            else answer.append(s.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "z";
        int n = 1;
        Caesar caesar = new Caesar();
        System.out.println(caesar.solution(s,n));
    }
}
