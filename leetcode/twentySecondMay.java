package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class twentySecondMay {
    public static void main(String[] args) {
        
    }
    public int[] topK(int [] nums, int k){
        HashMap<Integer, Integer> stor = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(stor.containsKey(nums[i])){
                stor.put(nums[i], stor.get(nums[i])+1);
                
            }
            else stor.put(nums[i], 1); 
        }
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stor.values()){
            pQ.add(i);
        }
        int n=0;
        int[] result = new int[k];
        while(n<k){
            int freq = pQ.poll();
            for (int key : stor.keySet()) {
                if (stor.get(key) == freq) {
                    result[n] = key;
                    n++;
                }
            }
        }
        return result;
    }
}
