package Week3;

public class CalculatorCon {
    int a, b;
    public CalculatorCon(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus(){
        int result = a+b;
        System.out.println(result);
    }

    public void minus(){
        int result = a-b;
        System.out.println(result);
    }

    public void multiple(){
        int result = a*b;
        System.out.println(result);
    }

    public void divide(){
        float result = (float) a/b;
        System.out.println(result);
    }

}
