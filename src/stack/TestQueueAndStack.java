package stack;

public class TestQueueAndStack {
    public static void main(String[] args) {
        testQueue();
        testStack();
    }

    public static void testQueue(){
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println("\nqueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    public static void testStack(){
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("\nstack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
