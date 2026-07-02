package org.com.javaprograms.dataStructures;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int nodesCount;

    public SinglyLinkedList() {
        this.head = null;
        this.nodesCount = 0;
    }

    public boolean isListEmpty() {
        return head == null;
    }

    public int getNodesCount() {
        int count = 0;
        if (!isListEmpty()) {
            Node trav = head;
            while (trav != null) {
                trav = trav.next;
                count++;
            }
        }
        return count;
    }

    public void addNodeAtFirstPosition(int data) {
        Node newNode = new Node(data);
        if (isListEmpty()) {
            head = newNode;
            nodesCount++;
        } else {
            newNode.next = head;
            head = newNode;
            nodesCount++;
        }
    }

    public void addNodeAtLastPosition(int data) {
        Node newNode = new Node(data);
        if (isListEmpty()) {
            head = newNode;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            nodesCount++;
        }
    }

    public void addNodeAtSpectificposition(int data, int position) {
        if (position == 1) {
            addNodeAtFirstPosition(data);
        } else if (position == getNodesCount()) {
            addNodeAtLastPosition(data);
        } else {
        }
        Node newNode = new Node(data);
        int i = 1;
        Node trav = head;
        while (i < position - 1) {
            i++;
            trav = trav.next;
        }
        newNode.next = trav.next;
        trav.next = newNode;
        nodesCount++;

    }

    public void displayLinkedList() {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else {
            Node trav = head;
            System.out.println("size of linked list : " + getNodesCount());
            System.out.print("List is head ->  ");
            while (trav != null) {
                System.out.printf("%d -> ", trav.data);
                trav = trav.next;
            }
            System.out.println("null");
        }
    }

    public void deleteNodeAtFirstPosition() {
        if (isListEmpty()) {
            throw new RuntimeException("List is empty");
        } else if (head.next == null) {
            head = null;
            nodesCount--;
        } else {
            head = head.next;
            nodesCount--;
        }
    }

    public void deleteNodeAtLastPosition() {
        if (isListEmpty()) {
            throw new RuntimeException("List is empty");
        } else {
            if (head.next == null) {
                head = null;
                nodesCount--;
            } else {
                Node trav = head;
                while (trav.next.next != null) {
                    trav = trav.next;
                }
                trav.next = null;
            }
        }

    }

    public void deleteNodeAtSpectifiposition(int pos) {
        if (pos == 1) {
            deleteNodeAtFirstPosition();
        } else if (pos == getNodesCount()) {
            deleteNodeAtLastPosition();
        } else {
            Node trav = head;
            int i = 1;
            while (i < pos - 1) {
                i++;
                trav = trav.next;
            }
            trav.next = trav.next.next;
            nodesCount--;
        }
    }

    public void reverseLinkedList() {
        if (isListEmpty()) {
            throw new RuntimeException("List is empty");
        } else {
            Node t1 = head;
            Node t2 = t1.next;
            t1.next = null;
            while (t2 != null) {
                Node t3 = t2.next;
                t2.next = t1;
                t1 = t2;
                t2 = t3;
            }

            head = t1;
        }
    }
}
