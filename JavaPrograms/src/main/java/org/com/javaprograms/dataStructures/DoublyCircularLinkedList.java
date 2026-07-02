package org.com.javaprograms.dataStructures;

public class DoublyCircularLinkedList {

    static class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    private Node head;
    private int nodesCount;

    public DoublyCircularLinkedList(){
        head=null;
        nodesCount=0;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getNodesCount(){
        return nodesCount;
    }

    public void addNodeAtLastPosition(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head = newNode;
            newNode.next=head;
            newNode.prev=newNode;
            nodesCount++;
        }else{
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next =newNode;
            head.prev = newNode;
            nodesCount++;
        }
    }

    public void addNodeAtFirstPosition(int data){
        Node newNode=new Node(data);

        if(isEmpty()){
            head=newNode;
            newNode.next=head;
            newNode.prev=newNode;
            nodesCount++;
        }else{
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
            nodesCount++;
        }
    }

    public void deleteNodeAtLastPosition(){
        if(!isEmpty()){
            if(head==head.next){
                head = null;
                nodesCount--;
            }else{
                head.prev.prev.next = head;
                head.prev = head.prev.prev;
                nodesCount--;
            }


        }
    }

    public void displayLinkedList(){
        if(!isEmpty()){
            Node trav = head;
            System.out.println("Number of nodes : " + getNodesCount());
            System.out.print("Linked List in forward direction : ");

            do{
                System.out.print(trav.data + " ");
                trav = trav.next;
            }while(trav!=head);
            System.out.println();

            //in backward direction
            trav = head.prev;
            System.out.print("Linked List in backward direction : ");
            do{
                System.out.print(trav.data + " ");
                trav = trav.prev;
            }while(trav!=head.prev);
        }else{
            System.out.println("Empty List");
        }
    }



}
