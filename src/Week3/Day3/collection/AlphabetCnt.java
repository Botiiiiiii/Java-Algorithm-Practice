package Week3.Day3.collection;

import java.util.HashMap;

public class AlphabetCnt {

    public boolean isAlphabet(char ch){
        return ( (ch >= 65 && ch<90) || (ch>=97 && ch<=122));

    }

    public static void main(String[] args) {
        HashMap<Character, Integer> Alphcnt = new HashMap<>();
        AlphabetCnt Alphcheck = new AlphabetCnt();
        String s1 = "asdasda://dskjhg".toUpperCase();
        for (int i = 0 ; i < s1.length(); i++){
            char c = s1.charAt(i);
            if(Alphcheck.isAlphabet(c)){
                if (Alphcnt.get(c) == null){
                    Alphcnt.put(c,1);
                } else{
                    Alphcnt.put(c,Alphcnt.get(c)+1);
                }
            }

        }
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c : %d\n", i, Alphcnt.get((char) i));
        }
        // String을 한글자씩 출력할 수 있어야 한다.
    }
}
