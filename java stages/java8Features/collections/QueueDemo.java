package java8Features.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Deque q=new ArrayDeque();
        q.add("hello");
        q.add("hi");
        q.add("welcome");
        q.add("hiiiiii");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
