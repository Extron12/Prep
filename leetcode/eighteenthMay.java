package leetcode;

import java.util.ArrayList;
import java.util.List;

public class eighteenthMay {
    public static void main(String[] args) {
        
    }
    public List<Integer> findSmallestSetofVertices(int n, List<List<Integer>> edges){
        List<Integer> arr = new ArrayList<Integer>();
        int arr1[] = new int[n];
        for(List<Integer> er :edges){
            arr1[er.get(1)]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==0){
                arr.add(i);
            }
        }
        return arr;

    }
}
