package org.datastructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
        myLinkedList.append(2);
//        myLinkedList.PrintList();
//        System.out.println(myLinkedList.removeLast());
        myLinkedList.prepend(5);
//        myLinkedList.remove(2);
        myLinkedList.PrintList();
        myLinkedList.reverse();
        System.out.println("\n");
        myLinkedList.PrintList();

    }


}
