
import java.util.Stack;

public class MyQueue {
    Stack<Integer> lifo = new Stack<Integer>();
    Stack<Integer> fifo = new Stack<Integer>();

    public MyQueue() {

    }

    public void push(int x) {
        while (!fifo.isEmpty()){
            lifo.push(fifo.pop());
        }
        lifo.push(x);
        while (!lifo.isEmpty()){
            fifo.push(lifo.pop());
        }
    }

    public int pop() {
        return fifo.pop();
    }

    public int peek() {
        return fifo.peek();
    }

    public boolean empty() {
        return fifo.isEmpty();
    }
}
