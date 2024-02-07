import com.linkedlist.stackandqueue.Myqueue;
import com.linkedlist.stackandqueue.Mystack;

public class Main {
    public static void main(String[] args) {
        Myqueue queue = new Myqueue();
        queue.add(56);
        queue.add(30);
        queue.add(70);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}