package algo_exercise.PriorityQueue;

import java.util.PriorityQueue;

public class KthSort {
    int[] arr;

    public int PQ_kth(int[] commands) {
        int Fromidx = commands[0];
        int Toidx = commands[1];
        int K = commands[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = Fromidx-1; i < Toidx; i++) {
            pq.add(this.arr[i]);
        }

        for (int i = 0; i < K; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = PQ_kth(commands[i]);
        }
        return answer;
    }
}

