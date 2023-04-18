package leetcode;
import java.util.*;


public class seventeenApril {
    public static void main(String[] args) {
        int arr[] = {4,2,1,1,2};
        int extra = 1;
        seventeenApril obj = new seventeenApril();
        List<Boolean> res = new ArrayList<>();

        res = obj.kidsWithCandies(arr, extra);
        for(boolean i:res){
            System.out.println(i);
        }
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>() ;
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}
