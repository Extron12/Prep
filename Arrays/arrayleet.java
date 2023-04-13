package Arrays;

/**
 * arrayleet
 */
public class arrayleet {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,4,3,2,1};
        int n=4;
        arrayleet obj = new arrayleet();
        int[] arr = obj.shuffle(num,n);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int[] buildArray(int[] num){
        int[] arr = new int[num.length];
        for(int i=0;i<num.length;i++){
            arr[i] = num[num[i]];
            //System.out.println(arr[i]+" Executed");
        }
        return arr;
    }
    public int[] concat(int[] nums){
        int arr[] = new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            if(i<nums.length){
                arr[i] = nums[i];
                // System.out.println("Exec1");
            }
            else{
                arr[i] = nums[i-nums.length];
                //System.out.println("Exec2");
            }
        }
        return arr;

    }

    public int[] shuffle(int[] nums, int n){
        int arr[] = new int[2*n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[c] = nums[i];
            c++;
            arr[c] = nums[n+i];
            c++;
        }
        return arr;
    }
    
}