package Top_interview;

public class stringInt {
    public static void main(String[] args) {
        String s = "-91283472332";
        int val = (myatoi(s));
        System.out.println(val);
    }
    public static int myatoi(String s){
        boolean pos = true;
        long val =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==45){
                pos = false;
            }
            else if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=112)){
                return (int)val;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                val = 10*val +(s.charAt(i)-'0');
            }
        }
        System.out.println(val+" is the value");
        if(pos == false){
            val = -val;
        }
        if(val>Integer.MAX_VALUE){
            val = Integer.MAX_VALUE;
        }
        if(val<Integer.MIN_VALUE){
            val = Integer.MIN_VALUE;
        }
        return (int)val;
    }
}
