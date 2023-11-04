import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T>
{
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item)
    {
        stack.add(item);
    }

    public T pop() 
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    public static void main(String[] args)
    {
        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Stack size: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.isEmpty())
        {
            System.out.println("Popped: " + intStack.pop());
        }

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Stack size: " + stringStack.size());
        System.out.println("Top element: " + stringStack.peek());

        while (!stringStack.isEmpty()) {
            System.out.println("Popped: " + stringStack.pop());
        }
    }
}
