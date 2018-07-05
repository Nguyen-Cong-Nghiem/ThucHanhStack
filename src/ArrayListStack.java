public class ArrayListStack implements MyStack {
    private int count=0;
    public ArrayListStack(int size) {

    }
    @Override
    public void push(int element) {
        count++;

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int getSize() {
        return count;
    }
}
