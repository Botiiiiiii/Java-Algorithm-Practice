package algo_exercise.Hash;

public class HashFunction {
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        System.out.println(asciiSum);

        return asciiSum % 90;
    }

    public static void main(String[] args) {
        HashFunction hashFunction = new HashFunction();
        int result = hashFunction.hash("jinwoo");
        System.out.println(result);
    }
}
