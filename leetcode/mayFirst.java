package leetcode;

import java.util.Arrays;

public class mayFirst {
    public static void main(String[] args) {
        
    }
    public double average(int[] salary){
        Arrays.sort(salary);
        int avg =0;
        for(int i=1; i<salary.length-1;i++){
            avg+= salary[i];
        }
        double val = avg/salary.length-2;

        return val;
    }
    public double averageBetter(int[] salary){
        int sum=0;
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: salary){
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);

        }
        return (double)(sum-min-max)/salary.length-2;
    }
}
