package org.com.javaprograms.dataStructures;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        System.out.println("Initial linked list");
        linkedList.displayLinkedList();

        linkedList.addNodeAtFirstPosition(30);
        linkedList.addNodeAtFirstPosition(20);
        linkedList.addNodeAtFirstPosition(10);
        linkedList.addNodeAtLastPosition(40);
        linkedList.addNodeAtLastPosition(50);
        System.out.println("\nAfter adding nodes at first and last positions");
        linkedList.displayLinkedList();

        linkedList.addNodeAtSpectificposition(35, 4);
        System.out.println("\nAfter adding a node at position 4");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtFirstPosition();
        System.out.println("\nAfter deleting first node");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtLastPosition();
        System.out.println("\nAfter deleting last node");
        linkedList.displayLinkedList();

        linkedList.deleteNodeAtSpectifiposition(3);
        System.out.println("\nAfter deleting node at position 3");
        linkedList.displayLinkedList();

        linkedList.reverseLinkedList();
        System.out.println("\nAfter reversing the linked list");
        linkedList.displayLinkedList();
    }
}
