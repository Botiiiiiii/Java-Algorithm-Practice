package algo_exercise.KakaoBlind;


public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] tmp_list = new String[n];


        for (int i = 0; i < n; i++) {
            String solv = Integer.toBinaryString(arr1[i] | arr2[i]);
            solv = "0".repeat(n - solv.length()) + solv;
            solv = solv.replace("1","#");
            solv = solv.replace("0"," ");
            answer[i] = solv;
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int n = 5;
        int[] arr1 = new int[]{9,29,28,18,11};
        int[] arr2 = new int[]{30,1,21,17,28};
        secretMap.solution(n,arr1,arr2);
    }
}

