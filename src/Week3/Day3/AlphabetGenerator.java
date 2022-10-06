package Week3.Day3;

public class AlphabetGenerator implements Generator<Character>{
    @Override
    public Character generate(int num) {
        int rndNum = (int) (Math.random() * 26);
        char alphabet = (char) (rndNum + 64);
        return alphabet;
    }
}