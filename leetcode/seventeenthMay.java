package leetcode;

import java.util.ArrayList;

public class seventeenthMay {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }

    public int pairSum(ListNode head){
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr= curr.next;
        }
        int count = arr.size();
        
        int data = Integer.MIN_VALUE;
        for(int i=0;i<(arr.size()/2);i++){
            int sum = arr.get(i)+arr.get(count-1-i);
            if(sum>data){
                data = sum;
            }
        }
        
        return data;
    }

}
