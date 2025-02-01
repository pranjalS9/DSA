package src.LinkedList;

class SinglyNode {
    int data;
    SinglyNode next;

    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    static SinglyNode insertAtHead(SinglyNode head, int d) {
        // Create new Node
        SinglyNode temp = new SinglyNode(d);
        temp.next = head;
        head = temp;
        return head;
    }

    static void insertAtTail(SinglyNode tail, int d) {
        SinglyNode temp = new SinglyNode(d);
        tail.next = temp;
        tail = temp;
    }

    static SinglyNode insertAtPosition(SinglyNode tail, SinglyNode head, int pos, int d) {
        // Insert at Start
        if(pos == 1) {
            return insertAtHead(head, d);
        }

        SinglyNode temp = head;
        int count = 1;

        while(count < pos - 1) {
            temp = temp.next;
            count++;
        }

        // Insert at Last
        if(temp.next == null) {
            insertAtTail(tail, d);
            return head;
        }

        SinglyNode singlyNodeToInsert = new SinglyNode(d);
        singlyNodeToInsert.next = temp.next;
        temp.next = singlyNodeToInsert;

        return head;
    }

    static SinglyNode deleteAtPosition(SinglyNode head, int pos) {
        SinglyNode temp = head;

        if(pos == 1){
            head = head.next;
            temp.next = null;
            return head;
        }

        int count = 1;

        while(count < pos - 1) {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;
        return head;
    }

    static void print(SinglyNode head) {
        SinglyNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp);
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyNode singlyNode = new SinglyNode(10);

        // head pointed to node
        SinglyNode head = singlyNode;
        SinglyNode tail = singlyNode;

        System.out.println("Initial");
        print(head);

        System.out.println("Insertion at Head");
        head = insertAtHead(head, 8);
        print(head);

        System.out.println("Insertion at Tail");
        insertAtTail(tail, 14);
        print(head);

        System.out.println("Insertion at a Position");
        head = insertAtPosition(tail, head, 3, 12);
        print(head);

        System.out.println("Deletion at a Position");
        head = deleteAtPosition(head, 1);
        print(head);
    }
}
