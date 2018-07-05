package stackofarraylist;

public class ArrayStack implements MyStack {
    private int size;
    private int[]arr;
    private int index=0;

    public ArrayStack(int size) {
        this.size=size;
        arr = new int[size];
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("dA DAY");
        }
        arr[index]=element;
        index++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Thung rong");
        }
        return arr[--index];
    }

    @Override
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return index;
    }
}
