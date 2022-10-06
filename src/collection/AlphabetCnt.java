package collection;

public class AlphabetCnt {

    public boolean isAlphabet(char ch){
        if( (ch >= 65 && ch<90) || (ch>=97 && ch<=122)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        AlphabetCnt Alphcheck = new AlphabetCnt();
        String s1 = "asdasda";
        System.out.println(Alphcheck.isAlphabet(s1.charAt(0)));
        // String을 한글자씩 출력할 수 있어야 한다.
    }
}
