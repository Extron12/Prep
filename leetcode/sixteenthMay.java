package leetcode;

class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class sixteenthMay {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode front = null;
        int count = 0 ;
        while(curr!=null && count<2){
            System.out.println("exec");
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
            count++;
        }
            System.out.println("called");
            head.next = swapPairs(curr);
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
        return null;
    }

    ListNode curr = head;
    ListNode prev = null;
    ListNode front = null;

    int count = 0;
    ListNode node = head;
    
    while (count < k && node != null) {
        node = node.next;
        count++;
    }

    if (count == k) {
        while (count > 0) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
            count--;
        }

        if (front != null) {
            head.next = reverseKGroup(front, k);
        }

        return prev;
    } else {
        return head;
    }
    }
}
