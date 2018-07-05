package stackoflinkedlist;

public class GenericStackClient {
    private static void stackOfIsString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kich thuoc sau khi nhap phan tu vao la: " + stack.size());
        System.out.println("Cac phan tu lay ra tu Stack la: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println("Kich thuoc sau khi lay phan tu ra la: " + stack.size());
    }


    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(67);
        stack.push(61);
        stack.push(5445);
        stack.push(689890);
        stack.push(1000);
        System.out.println("Kich thuoc sau khi nhap phan tu vao la: " + stack.size());
        System.out.println("Cac phan tu trong Stack la: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Kich thuoc Stack sau khi lay phan tu ra la: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Cac phan tu Integer la: ");
        stackOfInteger();
        System.out.print("--------------------------------"+"\n");
        System.out.println("Cac phan tu String la: ");
        stackOfIsString();
    }
}
