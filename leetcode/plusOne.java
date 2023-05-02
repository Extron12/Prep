package leetcode;

import java.math.BigInteger;

public class plusOne {
    public static void main(String[] args) {
        int exe[] = {9,8,7,6,5,4,3,2,1,0};
        int sol[] = plusO(exe);

        for(int i=0;i<sol.length;i++){
            System.out.println(sol[i]);
        }
    }
    public static int[] plusO(int[] dig){
        long val =0;
        for(int i=0;i<dig.length;i++){
            val = val*10+dig[i];
            //System.out.println("Value of val2 :"+ val);
        }
        val++;
        //System.out.println("Value of val :"+ val);
        String num = Integer.toString((int)val);
        
            if(num.length()>dig.length){
                int arr[] = new int[dig.length+1];
                for(int i=dig.length;i>=0;i--){
                    //System.out.println("Value of val1 :"+ val);
                    long temp = val%10;
                    arr[i] = (int)temp;
                    //System.out.println("Value of arr :"+arr[i]);
                    val = val/10;
                    //System.out.println("Value of val2 :"+ val);
                }
                return arr;
            }
            int arr[] = new int[dig.length];
            for(int i=dig.length-1;i>=0;i--){
                long temp = val%10;
                arr[i] = (int)temp;
                //System.out.println("Value of arr :"+arr[i]);
                System.out.println("Value of val2 :"+ val);
                val = val/10;
        }
        return arr;
    }
    
}
