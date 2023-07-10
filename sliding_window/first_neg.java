package sliding_window;

import java.util.*;

public class first_neg {
    public static void main(String[] args) {
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        int i=0;
        int j=0;
        int k=3;
        List<Integer> l = new ArrayList<Integer>();
        while(j<arr.length){
            if (arr[j] <0){
                l.add(arr[j]);
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(l.size() == 0){
                    System.out.println("No -ve number");
                }
                else {
                    System.out.println(l.get(0));
                    if(arr[i]== l.get(0)){
                        l.remove(0);
                    }
                }
                i++;
                j++;
            }
        }


    }
}
