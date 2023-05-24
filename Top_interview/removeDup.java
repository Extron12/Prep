package Top_interview;

public class removeDup {
    public static void main(String[] args) {
        
    }
    public int removeDuplicates(int[] nums){
        int c =nums[0];
        int val=2;
        int count=0;
        int ind =0;
        for(int i=1;i<nums.length;i++){
            if(c<=nums[i] && count<val){
                c = nums[i];
                count++;
                nums[ind] = c;
                ind++;
            }
        }
        return ind;
    }
}
