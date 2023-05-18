package stack;

import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.System.out;

public class BlockingQueue {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(() -> {
            String[] listWords = new String[] {"list", "words", "nokia", "notepad", "stack", "arrays", "doom", "kill", "frost"};
            for (int i = 0; i < listWords.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(5000);
                    queue.put(listWords[i]);
                    out.println("Producer write: " + listWords[i]);
                    i++;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()){
                try {
                    sb.setLength(0);
                    Thread.sleep(8000);
                    sb.append(queue.take());
                    System.out.println("Consumer read: " + sb.reverse());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        consumer.start();
    }
}
