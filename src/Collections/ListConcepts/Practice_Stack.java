package Collections.ListConcepts;

import java.util.Stack;

public class Practice_Stack {
    public static void main(String[] args) {
        //LIFO
        //Stack is a subclass of Vector that implements a standard last-in, first-out stack.

        //Stack only defines the default constructor, which creates an empty stack. Stack includes all the methods defined by Vector, and adds several of its own.

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);

        System.out.println(numbers);//[10, 20, 30, 40]

        numbers.pop();
        System.out.println(numbers);//[10, 20, 30]

        boolean b =numbers.empty();
        System.out.println(b); //false

        numbers.peek();
        System.out.println(numbers);//[10, 20, 30]







    }
}
