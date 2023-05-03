package leetcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class mayThird {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4,6};
        System.out.println(findDiff(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int nums2[]){
        List<List<Integer>> finalVal = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int c1=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    break;
                }
                else c1++;
            }
            if(c1==nums2.length){
                inner.add(nums1[i]);
            }
        }
        System.out.println(inner);
        List<Integer> outer = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int c1=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    break;
                }
                else c1++;
            }
            if(c1==nums1.length){
                outer.add(nums2[i]);
            }
        }
        System.out.println(outer);
        finalVal.add(inner);
        finalVal.add(outer);

        return finalVal;
    }
    public static List<List<Integer>> findDiff(int[] nums1, int nums2[]){
        List<List<Integer>> finalVal = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        List<Integer> outer = new ArrayList<>();
        Set<Integer> arr1 = new HashSet<Integer>();
        Set<Integer> arr2 = new HashSet<Integer>();
        for(int i:nums1){
            arr1.add(i);
        }
        for(int i:nums2){
            arr2.add(i);
        }
        for(int i :arr1){
            if(arr2.contains(i)==false){
                inner.add(i);
            }
        }
        for(int i:arr2){
            if(arr2.contains(i)==false){
                outer.add(i);
            }
        }

        finalVal.add(inner);
        finalVal.add(outer);

        return finalVal;
    }
}
