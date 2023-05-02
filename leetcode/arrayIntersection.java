package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class arrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int arr[] = twoIntersect(nums1, nums2);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
    public static int[] twoIntersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> val = new HashMap<Integer, Integer>();
        for(int i=0;i<nums1.length;i++){
            int temp =0;
            if(!val.containsKey(nums1[i])){
                val.put(nums1[i],1);
            }
            else
                temp = val.get(nums1[i]);
                val.replace(nums1[i],temp++);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<nums2.length;i++){
                if(val.containsKey(nums2[i])){
                    val.put(nums2[i],val.get(nums2[i])-1);
                    System.out.println("Exec ");
                    if(!arr.contains(nums2[i])){
                        arr.add(nums2[i]);
                    }
                }

            }
            int[] exe = new int[arr.size()];
            for(int i=0;i<arr.size();i++){
                exe[i] = arr.get(i);
            }

        return exe;
    }
    public static int[] testSol(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length+nums2.length];
        int count =0;
        for(int i = 0; i<nums1.length; i++ ) {
            for(int j = 0; j<nums2.length; j++) {
               if(nums1[i]==nums2[j]) {
                  arr[count] = nums2[j];
                  count++;
               }
            }
         }
         return arr;
    }
    public static int[] finalSol(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]<nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] finalArr = new int[arr.size()];
        int k=0;
        while(k<finalArr.length){
            finalArr[k] = arr.get(k);
            k++;
        }
        return finalArr;
    }
}
