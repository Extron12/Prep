package Arrays;

import java.util.*;

/**
 * arrayleet
 */
public class arrayleet {

    public static void main(String[] args) {
        int num[] = {5,0,1,2,3,4};
        arrayleet obj = new arrayleet();
        int[] arr = obj.buildArray(num);

        for (int i=0;i<num.length;i++){
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

    
}