package Top_interview;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int sol = removeDup(arr);
        System.out.println(sol);
    }
    public static int removeDup(int[] nums){
        int num=1;
        
        int c= nums[0];
        for(int i=1;i<nums.length;i++){
            if(c<nums[i]){
                c = nums[i];
                num++;
                nums[num-1]=c;
            }
        }
        return num;
    }
}
