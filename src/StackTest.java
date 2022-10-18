public class StackTest {
    public static void main(String[] args) {
    StackOnArray1<Integer> stack = new StackOnArray1<>();
    stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack.isEmpty());



    }
}
