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
        return count--;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int getSize() {
        return count;
    }
}
