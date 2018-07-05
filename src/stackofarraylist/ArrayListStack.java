package stackofarraylist;

import java.util.ArrayList;

public class ArrayListStack implements MyStack {
    private ArrayList<Integer> elements = new ArrayList<>();

    ArrayListStack() {

    }

    @Override
    public void push(int element) {
        elements.add(element);

    }

    @Override
    public int pop() {
        int lastestIndex = getSize() - 1;
        return elements.remove(lastestIndex);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int getSize() {
        return elements.size();
    }
}
