package Linked_list;

public class leet_206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store next node
            current.next = prev; // Reverse pointer
            prev = current; // Move prev forward
            current = nextNode; // Move current forward
        }

        return prev; // New head of reversed list
    }

    public static void main(String[] args) {
        leet_206 obj = new leet_206();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        // Reversing the list
        ListNode reversedHead = obj.reverseList(head);

        // Printing the reversed list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}
