import java.util.*;
public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();// Can use ArrayDeque<>() also 
        //Queue is an interface- implements two classes, array dequeue and linked lists
        // Queue acts as an interface and LinkedLists is the class and we can create objects for it
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
