package java8Features.collections;

import java.util.Stack;

public class StackDEMO {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push("hello");
        s.push("jai ");
        s.add("pragnya");
        System.out.println(s.pop());
        System.out.println(s);
    }
}
