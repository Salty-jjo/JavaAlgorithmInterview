/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (ListNode list : lists) {
            if (list != null) {
                arr.add(list.val);
                while (list.next != null) {
                    list = list.next;
                    arr.add(list.val);
                }
            }
        }

        Collections.sort(arr);
        ListNode answer = new ListNode(0);
        ListNode tail = answer;
        for (int i = 0; i < arr.size(); i++) {
            tail.next = new ListNode(arr.get(i));
            tail = tail.next;
        }
        return answer.next;
    }
}