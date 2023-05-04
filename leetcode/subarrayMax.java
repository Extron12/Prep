package leetcode;
import java.lang.Math;

public class subarrayMax {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArr(nums));
    }
    public static int maxSubArr(int [] nums){
        int sum =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i, tot =0;j<nums.length;j++){
                tot+=nums[j];
                sum = Math.max(tot, sum);
            }
        }
        return sum;
    }
    public static int maxSubBetter(int[] nums){
        int sum=0;
        int max = Integer.MIN_VALUE;
        int j=0;
        while(j<nums.length){
            if(sum <0 && nums[j]>=sum){
                sum =0;
            }   
            sum+= nums[j];
            max = Math.max(max,sum);
            j++;
        }
        return max;
    }
}
