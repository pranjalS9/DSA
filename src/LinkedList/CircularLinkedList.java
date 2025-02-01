package src.LinkedList;

class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    static CircularNode insertNode(CircularNode tail, int element, int d) {
        if(tail == null) {
            // Empty list
            CircularNode newNode = new CircularNode(d);
            tail = newNode;
            newNode.next = newNode;
        }
        else {
            CircularNode curr = tail;
            while (curr.data != element) {
                curr = curr.next;
            }
            CircularNode temp = new CircularNode(d);
            temp.next = curr.next;
            curr.next = temp;
        }
        return tail;
    }

    static CircularNode deleteNode(CircularNode tail, int val) {
        if(tail == null) {
            System.out.println("List is empty");
            return tail;
        }
        else {
            CircularNode prev = tail;
            CircularNode curr = prev.next;

            while (curr.data != val) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;

            // 1 Node in LL
            if(curr == prev) {
                tail = null;
            }

            // >=2 Node in LL
            else if (tail == curr) {
                tail = prev;
            }

            curr.next = null;
        }
        return tail;
    }

    static void print(CircularNode tail) {
        CircularNode temp = tail;

        if(tail == null) {
            System.out.println("List is Empty");
            return;
        }

        do {
            System.out.print(tail.data + " -> ");
            tail = tail.next;
        }
        while(tail != temp);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularNode tail = null;
        tail = insertNode(tail, 5, 3);
        print(tail);

//        tail = insertNode(tail, 3, 5);
//        print(tail);
//
//        tail = insertNode(tail, 5, 7);
//        print(tail);
//
//        tail = insertNode(tail, 3, 4);
//        print(tail);
//
//        tail = insertNode(tail, 5, 6);
//        print(tail);
//
        tail = deleteNode(tail, 3);
        print(tail);
    }
}
