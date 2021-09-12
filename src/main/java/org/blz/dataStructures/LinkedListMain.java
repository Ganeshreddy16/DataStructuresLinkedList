package org.blz.dataStructures;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 to add element at the Start");
        switch (input.nextInt()) {
            case 1:
                Operations.addElementAtStart();
        }














//        Node firstNode = new Node(56);
//        Node secondNode = new Node(30);
//        Node thirdNode = new Node(70);
//
//
//        Node head = firstNode;
//
//        firstNode.next = secondNode;
//        secondNode.next = thirdNode;
//
//        Node tail = thirdNode;
//
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }

    }
}
