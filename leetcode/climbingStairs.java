package leetcode;

public class climbingStairs {
    public static void main(String[] args) {
        int val =3;
        int sol = climbStairs(val);
        System.out.println(sol);    
    }
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        // int n1 =1;
        // int n2 =2;

        // for(int i=3;i<=n;i++){
        //     int next = n1;
        //     n1=n2;
        //     n2 = next+n2;
        // }
        return climbStairs(n-1)+climbStairs(n-2);
        
    }
}
