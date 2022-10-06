package Week3.Day3;

import java.util.HashSet;
import java.util.Set;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        Set<Integer> setInteger = new HashSet<>();

        for (int i = 0; i < 50; i++){
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
            setInteger.add(r);
        }
        System.out.println(setInteger);
    }
}
