package org.datastructure.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newDLL = new DoublyLinkedList(7);
        newDLL.append(5);
        newDLL.append(5);
        newDLL.prepend(1);
        newDLL.removeFirst();
//        System.out.println(newDLL.get(1).value);
        newDLL.set(2, 9);
        newDLL.insert(2, 11);
        newDLL.remove(1);
        newDLL.reverse();
        newDLL.printList();
    }

}
