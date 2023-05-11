package Keg2coba;

public class Main {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        queue.enqueue(0);
        queue.enqueue(2);
        queue.displayQueue();

        queue.enqueue(8);
        queue.enqueue(3);
        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();
    }
}
