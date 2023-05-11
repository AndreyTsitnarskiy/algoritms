package stack;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        ArrayList<String> list = generatorQueue();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < list.size() && Thread.interrupted();) {
                try {
                    Thread.sleep(5000);
                    queue.put(list.get(i));
                    System.out.println("Producer write: " + list.get(i));
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

    private static ArrayList<String> generatorQueue() {
        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            char a = (char) (random.nextInt(26) + 'a');
            char b = (char) (random.nextInt(26) + 'a');
            char c = (char) (random.nextInt(26) + 'a');
            char d = (char) (random.nextInt(26) + 'a');
            char e = (char) (random.nextInt(26) + 'a');
            String result = sb.append(a).append(b).append(c).append(d).append(e).toString();
            list.add(result);
            sb.setLength(0);
        }
        return list;
    }
}
