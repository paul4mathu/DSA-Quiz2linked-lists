public class Reversedlinkedlist {

    public static class LinkedListNode {
        int value;
        LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }

        public LinkedListNode(int value, LinkedListNode next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return value + (next == null ? "" : "->" + next.toString());
        }
    }

    public LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode prev = null;
        LinkedListNode curr = head;

        while (curr != null) {
            LinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Reversedlinkedlist list = new Reversedlinkedlist();

        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);

        System.out.println("The Linked list before reversal is:  " + head);

        LinkedListNode reversedList = list.reverse(head);

        System.out.println("The Linked list after reversal is:  " + reversedList);
    }

}