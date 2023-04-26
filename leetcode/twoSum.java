package leetcode;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {3,3};
        int val []= twoSums(arr, 6);
        for(int i : val){
            System.out.println(i);
        }
    }
    public static int[] twoSums(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        } 
        return new int[]{};  
    }
    
}
