package src.LinkedList;

import java.util.concurrent.CountDownLatch;

class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int d) {
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    static DoublyNode insertAtHead(DoublyNode head, DoublyNode tail, int data) {
        DoublyNode temp = new DoublyNode(data);

        if(head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }

    static void insertAtTail(DoublyNode head, DoublyNode tail, int data) {
        DoublyNode temp = new DoublyNode(data);
        if(tail == null) {
            tail = temp;
            head = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static DoublyNode insertAtPosition(DoublyNode head, DoublyNode tail, int pos, int data) {
        if(pos == 1) {
            return insertAtHead(head, tail, data);
        }

        DoublyNode temp = head;
        int count = 1;
        while(temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null) {
            return head;
        }

        if(temp.next == null) {
            insertAtTail(head, tail, data);
            return head;
        }

        DoublyNode nodeToInsert = new DoublyNode(data);
        nodeToInsert.next = temp.next;
        temp.next.prev = nodeToInsert;
        temp.next = nodeToInsert;
        nodeToInsert.prev = temp;

        return head;
    }

    static DoublyNode deleteAtPosition(DoublyNode head, int pos) {
        if(head == null) {
            return null;
        }
        DoublyNode temp = head;

        if(pos == 1){
            head = temp.next;
            temp.next = null;
            return head;
        } else {
            DoublyNode curr = head;
            DoublyNode prev = null;

            int count = 1;
            while(count < pos) {
                prev = curr;
                curr = curr.next;
                count++;
            }

            if(prev == null) {
                return head;
            }

            prev.next = curr.next;
            curr.next = null;
        }
        return head;
    }

    static void print(DoublyNode head) {
        if(head == null) {
            return;
        }

        DoublyNode temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println(temp);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyNode head = null;
        DoublyNode tail = null;

        System.out.println("Initial");
        print(head);

        System.out.println("Insertion at Head");
        head = insertAtHead(head, tail, 8);
        tail = head;
        print(head);

        System.out.println("Insertion at Tail");
        insertAtTail(head, tail, 14);
        print(head);

        System.out.println("Insertion at a Position");
        head = insertAtPosition(head, tail, 2, 12);
        print(head);

        System.out.println("Deletion at a Position");
        head = deleteAtPosition(head, 3);
        print(head);
    }
}
