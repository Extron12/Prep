package Top_interview;

public class removeElement {
    public static void main(String[] args) {
        
    }
    public int remove(int[]nums , int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        int fi = nums.length-count;
        return fi;
    }
}
