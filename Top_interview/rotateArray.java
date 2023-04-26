package Top_interview;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {-1,-100,3,99};
        int n=2;
        rotate(arr, n);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
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
    public static void rotate(int arr[],int n){
        n%=arr.length;
        rev(arr, 0, arr.length-1);
        rev(arr, 0, n-1);
        rev(arr, n, arr.length-1);
    }
    public static void rev(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
