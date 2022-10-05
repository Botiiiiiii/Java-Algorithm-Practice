package Week3.Week3_exercise;

public class RandomNumberGenerator  implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int) (Math.random() * num);
    }
}
