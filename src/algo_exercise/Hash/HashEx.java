package algo_exercise.Hash;

import java.util.HashMap;
import java.util.Objects;

public class HashEx {
    public String Solution(String[] participant, String[] completion){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (hashMap.containsKey(participant[i])){
                hashMap.put(participant[i],hashMap.get(participant[i]) + 1);
            } else{
                hashMap.put(participant[i],1);
            }
        }

        // for 문을 통해 있는 값 1씩 빼기
        for (int i = 0; i < completion.length; i++) {
            if (hashMap.get(completion[i]) == 1){
                hashMap.remove(completion[i]);
            }
            else{
                hashMap.put(completion[i],hashMap.get(completion[i]) - 1);
            }
        }
        Object[] answer = hashMap.keySet().toArray();

        return answer[0].toString();

    }
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        HashEx hashEx = new HashEx();
        System.out.println(hashEx.Solution(participant, completion));
    }

}
