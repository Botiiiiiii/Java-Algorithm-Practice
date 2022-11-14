package algo_exercise.prime;

import java.util.Arrays;

// 에라토스테네스 체
public class SearchPrime {
    public boolean Solution(int num){
        int N = 50; // N = 50
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기

        for (int i = 2; i < nums.length; i+=2) {
            nums[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                System.out.printf("%d ", nums[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SearchPrime searchPrime = new SearchPrime();
        searchPrime.Solution(10);
    }
}
