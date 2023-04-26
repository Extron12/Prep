package Top_interview;

public class singleNum {
    public static void main(String[] args) {
       int arr[] = {4,1,2,1,2};
       System.out.println(singleNumber(arr)); 
    }
    public static int singleNumber(int[] nums){
        int val =0;

        for(int n:nums){
            val ^=n;
        }
        return val;
    }
}
