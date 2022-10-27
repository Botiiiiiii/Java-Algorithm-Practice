package algo_exercise.Hash;

import java.util.HashMap;

public class HashEx {
    public String Solution(String[] participant, String[] completion){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (hashMap.get(participant[i]) == null){
                hashMap.put(participant[i],1);
            } else{
              int tmp = hashMap.get(participant[i]);
              hashMap.put(participant[i],tmp + 1);
            }
        }

        // for 문을 통해 있는 값 1씩 빼기

    }
    public static void main(String[] args) {


    }

}
