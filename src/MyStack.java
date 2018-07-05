public class MyStack {
    private int size;
    private int[]arr;
    private int index=0;

    public MyStack(int size) {
        this.size=size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("dA DAY");
        }
        arr[index]=element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Thung rong");
        }
        return arr[--index];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return index;
    }
}
