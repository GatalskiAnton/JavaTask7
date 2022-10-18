import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

    Stack()
    {
        stack = new ArrayList<>();
    }

    public void push(T data)
    {
        stack.add(data);
    };

    public T pop()
    {
        if (stack.isEmpty())
            throw new EmptyStackException();
        return  stack.remove(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    private ArrayList<T> stack;
}
