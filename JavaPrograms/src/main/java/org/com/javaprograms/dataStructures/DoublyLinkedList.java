package org.com.javaprograms.dataStructures;

public class DoublyLinkedList {

    static class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private int nodesCount;

    public DoublyLinkedList(){
        head = null;
        nodesCount = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getNodesCount(){
        return this.nodesCount;
    }

    public void addNodeAtLastPosition(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            nodesCount++;
        }else{
            Node trav = head;
            while(trav.next!=null){
                trav = trav.next;
            }
            trav.next = newNode;
            newNode.prev = trav;
            nodesCount++;
        }
    }

    public void addNodeAtFirstPosition(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            nodesCount++;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            nodesCount++;
        }

    }

    public void addNodeAtSpecificPosition(int data, int pos){
        Node newNode = new Node(data);
        if(pos==1){
            addNodeAtFirstPosition(data);
        }else if(pos==getNodesCount()+1){
            addNodeAtLastPosition(data);
        }else{
            Node trav = head;
            int i = 1;
            while(i < pos-1){
                trav = trav.next;
                i++;
            }
            newNode.prev = trav;
            newNode.next = trav.next;
            trav.next.prev = newNode;
            trav.next = newNode;

            nodesCount++;
        }
    }

    public void deleteNodeAtFirstPosition(){
        if (!isEmpty()){
            if(head.next == null){
                head= null;
                nodesCount--;
            }else{
                head = head.next;
                head.prev = null;
                nodesCount--;
            }
        }
    }

    public void deleteNodeAtlastPosition(){
        if (!isEmpty()){
            if(head.next==null){
                head = null;
                nodesCount--;
            }else{
                Node trav = head;
                while(trav.next.next!=null){
                    trav = trav.next;
                }
                trav.next = null;
                nodesCount--;
            }
        }
    }

    public void deleteNodeAtSpecificPosition(int pos){
        if (pos == 1){
            deleteNodeAtFirstPosition();
        }else if (pos == getNodesCount()){
            deleteNodeAtlastPosition();
        }else{
            int i = 1;
            Node trav = head;

            while(i < pos-1){
                i++;
                trav = trav.next;
            }
            trav.next.next.prev = trav;
            trav.next = trav.next.next;

            nodesCount--;
        }
    }

    public void displayLinkedList(){
        if(!isEmpty()){
            Node trav =  head;
            Node temp = null;
            System.out.println("Count of Nodes :  " + getNodesCount());
            System.out.print("List in forward direction: ");
            while(trav != null){
                temp = trav;
                System.out.printf("%4d", temp.data);
                trav = trav.next;
            }

            System.out.println();
            trav = temp;
            System.out.print("list in backward direction: ");
            while(trav != null){
                System.out.printf("%4d", trav.data);
                trav = trav.prev;
            }
            System.out.println();
        }else {
            System.out.println("List is empty");
        }
    }
}
