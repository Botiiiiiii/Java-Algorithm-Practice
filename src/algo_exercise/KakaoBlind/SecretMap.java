package algo_exercise.KakaoBlind;


public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[]{"123","123"};
        String arr1_list = "";
        while(arr1[0] > 0) {
            arr1_list = arr1[0] % 2 + arr1_list;
            arr1[0] /= 2;
        }
        System.out.println(arr1_list);
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
