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

    static SinglyNode insertAtTail(SinglyNode tail, int d) {
        SinglyNode temp = new SinglyNode(d);
        tail.next = temp;
        tail = temp;
        return tail;
    }

    static SinglyNode insertAtPosition(SinglyNode tail, SinglyNode head, int pos, int d) {
        // Insert at Start
        if(pos == 1) {
            return insertAtHead(head, d);
        }

        SinglyNode temp = head;
        int count = 1;

        while(temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null) {
            return head;
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

    static SinglyNode reverseKGroup(SinglyNode head, int k) {
        if(head == null || k <= 1) {
            return head;
        }

        int totalNodes = getTotalNodes(head);

        SinglyNode prevGroupEnd = null, curr = head, newHead = null;

        while(totalNodes >= k) {
            SinglyNode groupStart = curr;
            SinglyNode prev = null;
            int count = 0;

            while(count < k && curr != null) {
                SinglyNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
                count++;
            }

            if(newHead == null) {
                newHead = prev;
            }

            if(prevGroupEnd != null) {
                prevGroupEnd.next = prev;
            }

            prevGroupEnd = groupStart;
            prevGroupEnd.next = curr;

            totalNodes -= k;
        }
        return newHead;
    }

    private static int getTotalNodes(SinglyNode head) {
        SinglyNode temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyNode singlyNode = new SinglyNode(1);

        // head pointed to node
        SinglyNode head = singlyNode;
        SinglyNode tail = singlyNode;

        //-------------------
        tail = insertAtTail(tail, 2);
        tail = insertAtTail(tail, 3);
        tail = insertAtTail(tail, 4);
        tail = insertAtTail(tail, 5);

        head = reverseKGroup(head, 3);
        print(head);
        //-------------------

//        System.out.println("Initial");
//        print(head);
//
//        System.out.println("Insertion at Head");
//        head = insertAtHead(head, 8);
//        print(head);
//
//        System.out.println("Insertion at Tail");
//        insertAtTail(tail, 14);
//        print(head);
//
//        System.out.println("Insertion at a Position");
//        head = insertAtPosition(tail, head, 3, 12);
//        print(head);
//
//        System.out.println("Deletion at a Position");
//        head = deleteAtPosition(head, 1);
//        print(head);
    }

//    static SinglyNode reverseKGroup(SinglyNode head, int k) {
//        if (head == null || k <= 1) {
//            return head;
//        }
//
//        // Count total nodes
//        int totalNodes = 0;
//        SinglyNode temp = head;
//        while (temp != null) {
//            totalNodes++;
//            temp = temp.next;
//        }
//
//        // Reverse in groups of k
//        SinglyNode prev = null, curr = head;
//        SinglyNode newHead = null, prevGroupEnd = null;
//
//        while (totalNodes >= k) {
//            SinglyNode groupStart = curr;
//            SinglyNode groupEnd = prev;
//
//            // Reverse k nodes
//            int count = 0;
//            while (count < k && curr != null) {
//                SinglyNode nextNode = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nextNode;
//                count++;
//            }
//
//            // Connect previous group to current reversed group
//            if (prevGroupEnd != null) {
//                prevGroupEnd.next = prev;
//            } else {
//                newHead = prev; // Update new head after first reversal
//            }
//
//            // Move prevGroupEnd to groupStart
//            prevGroupEnd = groupStart;
//            prevGroupEnd.next = curr;
//
//            totalNodes -= k;
//            prev = prevGroupEnd;
//        }
//
//        return newHead;
//    }
//
//    static void print(SinglyNode head) {
//        SinglyNode temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        SinglyNode singlyNode = new SinglyNode(1);
//        SinglyNode head = singlyNode;
//        SinglyNode tail = singlyNode;
//
//        // Insert nodes
//        tail = insertAtTail(tail, 2);
//        tail = insertAtTail(tail, 3);
//        tail = insertAtTail(tail, 4);
//        tail = insertAtTail(tail, 5);
//
//        System.out.println("Original List:");
//        print(head);
//
//        head = reverseKGroup(head, 3);
//
//        System.out.println("Reversed in Groups of 3:");
//        print(head);
//    }

}


