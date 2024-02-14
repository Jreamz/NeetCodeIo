package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// https://leetcode.com/problems/merge-two-sorted-lists/description/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempNode = new ListNode(); // temp node to hold the merged list
        ListNode currentNode = tempNode; // pointer to the current node in the merged list

        // traverse each list until one of them reaches the end
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next; // move pointer forward in list1
            } else {
                currentNode.next = list2;
                list2 = list2.next; // move pointer forward in list2
            }
            currentNode = currentNode.next;
        }
        // append remaining list if the other is null
        if (list1 == null) {
            currentNode.next = list2;
        }

        if (list2 == null) {
            currentNode.next = list1;
        }
        return tempNode.next;
    }
}
