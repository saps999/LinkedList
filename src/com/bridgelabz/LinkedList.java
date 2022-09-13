package com.bridgelabz;

public class LinkedList {
    public Node head;
    public Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.add(70);
        l1.add(30);
        l1.add(56);
        l1.display();
    }
}
