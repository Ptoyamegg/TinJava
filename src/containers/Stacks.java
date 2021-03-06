package containers;
//  Demonstration of Stack Class.

import java.util.LinkedList;
import java.util.Stack;

enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER }

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month m : Month.values())
            stack.push(m.toString());
        System.out.println("stack = " + stack);
        //  Treating a stack a a Vector
        stack.addElement("The last line");
        System.out.println("element 5 :" + stack.elementAt(5));
        System.out.println("popping elements:");
        while (!stack.empty())
            System.out.print(stack.pop() + " ");

        //  Using a LinkedList as a Stack:
        LinkedList<String> lstack = new LinkedList<>();
        for (Month m : Month.values())
            lstack.addFirst(m.toString());
        System.out.println("lstack = " + lstack);
        while (!lstack.isEmpty())
            System.out.print(lstack.removeFirst() + " ");

        //  Using the Stack class from the Holding Your Objects Chapter:
        net.mindview.util.Stack<String> stack2 = new net.mindview.util.Stack<>();
        for (Month m : Month.values())
            stack2.push(m.toString());
        System.out.println("stack2 = " + stack2);
        while (!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
