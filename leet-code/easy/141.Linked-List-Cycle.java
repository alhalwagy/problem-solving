/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */

// solution with hashSet O(N)

// class Solution {
//  public boolean hasCycle(ListNode head) {
//
//    Set<ListNode> visited = new HashSet<>();
//    while (head !=null){
//
//      if(visited.contains(head)){
//        return true;
//      }
//      visited.add(head);
//      head = head.next;
//    }
//    return false;
//  }
// }

// Floyd’s Cycle Detection Algorithm
public class Solution {
  public boolean hasCycle(ListNode head) {

    if (head == null || head.next == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
