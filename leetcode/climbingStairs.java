package leetcode;

public class climbingStairs {
    public static void main(String[] args) {
        int val =10;
        int sol = climbStairs(val);
        System.out.println(sol);    
    }
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        int n1 =1;
        int n2 =2;

        for(int i=3;i<=n;i++){
            int next = n1;
            n1=n2;
            n2 = next+n2;
        }
        return n2;
    }
}
