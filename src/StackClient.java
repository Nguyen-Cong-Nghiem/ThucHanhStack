public class StackClient {
    public static void main(String[] args)  {
        MyStack myStack = new MyStack(5);

        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
//        myStack.push(1);

        System.out.println("1.Kich thuoc khi them vao la: "+ myStack.size());
        System.out.printf("2.Cac phan tu lay ra tu Stack la: ");

        while (!myStack.isEmpty()) {
            System.out.print("\t" + myStack.pop());
        }

        System.out.println("\n3.Kich thuoc Stack sau khi lay ra: "+ myStack.size());

    }
}
