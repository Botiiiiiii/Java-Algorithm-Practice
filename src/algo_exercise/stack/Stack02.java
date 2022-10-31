package algo_exercise.stack;

import java.util.EmptyStackException;

public class Stack02 {
    private Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value){
        this.arr[top++] = value;
    }
    public int pop(){

        return this.arr[--this.top];
    }

    public Integer[] getArr() {
        return arr;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int peek() {
        if(this.isEmpty()){
            throw  new EmptyStackException();
        }
        return this.arr[this.top];
    }
}