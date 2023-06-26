package leetcode;

import java.util.PriorityQueue;

public class twentyThirdMay {
    public static void main(String[] args) {
        
    }
    PriorityQueue<Integer> pq;
    int k=0;
    public void KthLargest(int k, int[] nums) {
       this.k =k;
       pq = new PriorityQueue<>();
       for(int i:nums){
           pq.add(i);
           if(pq.size() >k){
               pq.poll();
           }
       }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.remove();
        }
        return pq.peek();
    }
}
