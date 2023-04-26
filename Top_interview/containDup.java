package Top_interview;

import java.util.HashMap;

public class containDup {
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> dup = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dup.containsKey(nums[i])){
                return true;
            }
            else dup.put(nums[i], 1);
        }
        return false;
    }
}
