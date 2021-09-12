package org.blz.dataStructures;

public class LinkedLists {

    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            Node temp = head;
            this.head=newNode;
            newNode.next=temp;
        }
    }
    public void print()
    {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
            else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }
}
