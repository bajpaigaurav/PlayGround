public class LinkedList {
    private int size = 0;
    private Node head = null;
    private static class Node {
        int data;
        Node next;

        Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static Node createList(Node head, int num) {
        Node current = null;
        if(head == null) {
            head = new Node(num--, null);
            current = head;
        }
        while( num > 0 ) {
            Node newNode = new Node(num,null);
            current.next = newNode;
            current = newNode;
            num--;
        }
        return head;
    }

    static Node removeFromLast(Node head, int fromLast) {
        Node current = head;
        Node lazyPointer = head;
        while( current != null && fromLast > 0) {
            current = current.next;
            fromLast -= 1;
        }
        System.out.println("where is current:-"+ current.data);
        while(current.next != null) {
            current = current.next;
            lazyPointer = lazyPointer.next;
        }

        lazyPointer.next = lazyPointer.next.next;

        return head;

    }

    static Node reverseLinkedList(Node head, int k) {
        Node prev = null, current, temp = null;

        current = head;
        if(head.next == null || head == null || k == 0 || k == 1) {
            return head;
        }
        temp = head.next;
        int counter = 1;
        Node kthBlock = head;
        while(temp != null) {
            if( counter % k == 0) {
                current.next = prev;
                prev = current;

            } else {

                temp = temp.next;
            }
            current = temp;
            counter++;
        }
        //current.next = prev;
        //prev = current;
        return prev;
    }
    public static void main(String[] args) {
        Node node = createList(null,10);
        while(node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
        //node = removeFromLast(node,2);
//        node = createList(null,10);
//        node = reverseLinkedList(node,3);
//        while(node != null) {
//            System.out.print(node.data+" ");
//            node = node.next;
//        }

    }
}
