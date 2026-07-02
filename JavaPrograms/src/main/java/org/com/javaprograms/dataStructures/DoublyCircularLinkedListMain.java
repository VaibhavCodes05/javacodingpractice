package org.com.javaprograms.dataStructures;

public class DoublyCircularLinkedListMain {
    public static void main(String[] args) {
        DoublyCircularLinkedList linkedList = new DoublyCircularLinkedList();

        System.out.println("Initial doubly circular linked list");
        linkedList.displayLinkedList();

        linkedList.addNodeAtFirstPosition(20);
        linkedList.addNodeAtFirstPosition(10);
        linkedList.addNodeAtLastPosition(30);
        linkedList.addNodeAtLastPosition(40);
        System.out.println("\nAfter adding nodes at first and last positions");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtLastPosition();
        System.out.println("\nAfter deleting last node");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtLastPosition();
        System.out.println("\nAfter deleting another last node");
        linkedList.displayLinkedList();
    }
}
