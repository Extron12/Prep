package leetcode;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fizBuzz(n));
    }
    public static List<String> fizBuzz(int n){
        List<String> arr = new ArrayList<String>();
        for(int i=0;i<n;i++){
            if((i+1)%3==0 && (i+1)%5!=0){
                arr.add("Fizz");
            }
            else if((i+1)%5==0 && (i+1)%3!=0){
                arr.add("Buzz");
            }
            else if((i+1)%5==0 && (i+1)%3==0){
                arr.add("FizzBuzz");
            }
            else arr.add(String.valueOf(i+1));
        }
        return arr;
    }
}
