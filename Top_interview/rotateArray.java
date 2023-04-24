package Top_interview;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {-1,-100,3,99};
        int n=2;
        int arr1[] = rotateOne(arr, n);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr1[j]);
        }
    }
    public static int[] rotateOne(int arr[],int n){
        int j=0;
        while(j<n){
            int temp = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]= arr[i];
        }
        arr[0] = temp;
        j++;
        }
        return arr;

    }
}
