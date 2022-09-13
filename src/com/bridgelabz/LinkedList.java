package com.bridgelabz;

public class LinkedList<T> {
    public Node head;
    public Node tail;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }

    public void delete() {
        if (head == null) {
            System.out.println("The list is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.println(currnode.data + " ");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(56);
        l1.add(30);
        l1.add(70);
        l1.delete();
        l1.display();
    }
}
