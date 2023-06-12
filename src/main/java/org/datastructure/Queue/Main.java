package org.datastructure.Queue;

public class Main {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.dequeue();
        q.printQueue();
    }
}
