package leetcode;

public class twentySixApril {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num){
            int val=0;
            while(num>0){
                val += num%10;
                num = num/10;
                //System.out.println("Printed val :"+val);
                if(num==0){
                    //System.out.println("Exec "+val);
                    num = val;
                    if(val<10){
                        return val;
                    }
                    val =0;
                }
            }
            return val;
    }
    public static int altSol(int num){
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}
