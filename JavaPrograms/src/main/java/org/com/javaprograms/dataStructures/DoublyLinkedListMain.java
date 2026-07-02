package org.com.javaprograms.dataStructures;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        System.out.println("Initial doubly linked list");
        linkedList.displayLinkedList();

        linkedList.addNodeAtFirstPosition(20);
        linkedList.addNodeAtFirstPosition(10);
        linkedList.addNodeAtLastPosition(30);
        linkedList.addNodeAtLastPosition(50);
        System.out.println("\nAfter adding nodes at first and last positions");
        linkedList.displayLinkedList();

        linkedList.addNodeAtSpecificPosition(40, 4);
        System.out.println("\nAfter adding a node at position 4");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtFirstPosition();
        System.out.println("\nAfter deleting first node");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtlastPosition();
        System.out.println("\nAfter deleting last node");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtSpecificPosition(2);
        System.out.println("\nAfter deleting node at position 2");
        linkedList.displayLinkedList();
    }
}
