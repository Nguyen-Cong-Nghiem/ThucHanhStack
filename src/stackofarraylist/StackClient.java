package stackofarraylist;

import stackofarraylist.ArrayListStack;
import stackofarraylist.MyStack;

public class StackClient {
    public static void main(String[] args)  {
        MyStack stack = new ArrayListStack();
        stack.push(65);
        stack.push(48);
        stack.push(3);
        stack.push(26);
        stack.push(12);
        stack.push(78);
        stack.push(43);
        stack.push(11);

        System.out.println("size sau nhap phan tu la: "+ stack.getSize());
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.print(top+"\n");
        }

        System.out.println("size sau khi lay phan tu ra: " + stack.getSize());

    }
}
