package com.bridgelabz;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

        Node l1 = new Node(56);
        Node l2 = new Node(30);
        Node l3 = new Node(70);
        Node head = l1;
        head.next = l2;
        l2.next = l3;
        l3.next = null;
        System.out.println("Data in the Linked list are : " + l1.data + ", " + l2.data + ", " + l3.data);
        System.out.println("Address of node n1 is : " + l1.next);
        System.out.println("Address of node n2 is : " + l2.next);
        System.out.println("Address of node n3 is : " + l3.next);
    }

}
