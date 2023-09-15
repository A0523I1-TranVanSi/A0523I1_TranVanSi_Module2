package practice;
public class StackClient {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.size);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size);
    }
}
