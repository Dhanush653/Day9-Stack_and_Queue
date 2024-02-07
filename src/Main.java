import com.linkedlist.stackandqueue.Mystack;

public class Main {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.peak();
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}