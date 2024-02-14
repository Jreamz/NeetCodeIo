package LinkedList;

// https://leetcode.com/problems/reverse-linked-list/description/
public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
