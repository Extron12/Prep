package sliding_window;

public class sum_subArray {
    public static void main(String[] args) {
        int arr[] = {2,5,1,8,2,9,1};
        int i=0,j=0;
        int sum =0;
        int k =3;
        int max =0;
        while(j<arr.length){
            sum +=arr[j];
            if(j-i+1 == k){
                System.out.println("Value of sum : "+ sum);
                max = Math.max(max,sum);
                sum -=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
