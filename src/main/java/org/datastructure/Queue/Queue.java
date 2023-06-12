package org.datastructure.Queue;

public class Queue {
    private Node front;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        front = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            front = newNode;
            last = newNode;
            length = 1;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        Node temp = front;
        if (length == 0) {
            return null;
        } else if (length == 1) {
            front = null;
            last = null;
        } else {
            front = front.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
