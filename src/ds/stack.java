package ds;

// predefined stack
import java.util.EmptyStackException;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        boolean isEmpty =  stack.empty();
        System.out.println(isEmpty);

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        // printing stack methods
        /* Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        /*for (Integer integer : stack) {
            System.out.println(integer);
        }*/
        stack.forEach(System.out::println);
        // string stack
        Stack<String> strings = new Stack<>();
        strings.push("kt");
        strings.push("tejas");
        strings.push("ravi");
        strings.push("urvi");
        strings.push("pranav");
        strings.push("jaymin");

        System.out.println(strings.peek());
        System.out.println(strings.size());

        // another example

        Stack<Integer> newStack = new Stack<>();
        push_element(newStack, 100);
        push_element(newStack, 300);
        push_element(newStack, 500);
        push_element(newStack, 600);

        System.out.println("pop operation");
        try{
            pop_element(newStack);
            pop_element(newStack);
            pop_element(newStack);
            pop_element(newStack);
            pop_element(newStack);
        }catch (EmptyStackException e){
            System.out.println(e);
        }
    }

    static void pop_element(Stack stack){
        System.out.println(stack.pop());
    }
    static void push_element(Stack<Integer> stack, int element){
        stack.push(element);
        System.out.println(stack);
    }
}
