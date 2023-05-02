package leetcode;

public class moveZero {
    public static void main(String[] args) {
        int nums[] = {4,2,4,0,0,3,0,5,1,0};
        move(nums);
        for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
        }
    }
    public static void move(int[] nums){
            int[] arr = new int[nums.length];
            int te =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    arr[te] = nums[i];
                    te++;
                }
            }
            if(te<nums.length){
            for(int i=te+1;i<nums.length;i++){
                arr[i]=0;
                }
            }
            for(int i=0;i<nums.length;i++){
                nums[i] = arr[i];
                }
            nums = arr;
    }
}
