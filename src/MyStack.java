public class MyStack {
    private int size;
    private int[] arr;
    private int index = 0;

    public MyStack() {

    }

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Error");
        }
        arr[index]=element;
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Eroor");
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }

}
