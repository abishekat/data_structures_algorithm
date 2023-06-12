package org.datastructure.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        if (length == 0) {
            System.out.println("EMPTY DLL");
            ;
        } else {
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void getHead() {
        System.out.println("Head :::" + head.value);
    }

    public void getTail() {
        System.out.println("Tail :::" + tail.value);
    }

    public void getLength() {
        System.out.println("Length :::" + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (length == 0) return null;
        tail = temp.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        Node temp = head;
        if (index >= 0 && index <= length) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        if (index > 0 && index < length) {
            before.next = newNode;
            newNode.prev = before;
            newNode.next = after;
            after.prev = newNode;
            length++;
            return true;
        }
        return false;
    }

    public Node remove(int index) {
        Node temp = get(index);
        if (index == 0) {
            removeFirst();
            return temp;
        }
        if (index == (length - 1)) {
            removeLast();
            return temp;
        }
        if (index > 0 && index < length) {
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
        return temp;
    }

    public void reverse() {
        Node current = head;
        Node temp;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
}