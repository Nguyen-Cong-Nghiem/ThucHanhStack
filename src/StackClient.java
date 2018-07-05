public class StackClient {
    public static void main(String[] args)  {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("size sau nhap phan tu la: "+ stack.getSize());
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.print(top+"\n");
        }

        System.out.println("size sau khi lay phan tu ra: " + stack.getSize());

    }
}
