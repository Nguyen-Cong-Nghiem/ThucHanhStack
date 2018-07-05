package stackoflinkedlist;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
     public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Hang doi con rong!!!");
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

}
