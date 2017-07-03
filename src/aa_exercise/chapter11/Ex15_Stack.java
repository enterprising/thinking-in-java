package aa_exercise.chapter11;

import java.util.Stack;

/**
 * Created by peng.tan on 17/7/3.
 */
public class Ex15_Stack {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        stack.push('U');
        stack.push('n');
        stack.push('c');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push('e');
        stack.push('r');
        stack.push('t');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
