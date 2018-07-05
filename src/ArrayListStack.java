import java.util.ArrayList;

public class ArrayListStack implements MyStack {
    private ArrayList<Integer> elements= new ArrayList<>();

    public ArrayListStack(int size) {

    }
    @Override
    public void push(int element) {
        elements.add(element);

    }

    @Override
    public int pop() {
        return elements.remove(0);
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
