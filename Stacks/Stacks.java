import java.util.Stack;


public class Stacks {

    public static void main(String[] args)
    {
        Stack<String> s = new  Stack<String>();

        // Pushing Elements into the stack.

        s.push("Apple");
        s.push("Banana");
        s.push("Orange");
        s.push("Pears");
        s.push("Avocado");

        System.out.println("Stack Elements are: " + s);

        System.out.println("Stack's top element : " + s.peek());

        s.pop();
        s.pop();

        System.out.println("Stack Elements after popping are: " + s);



    }

    
}
