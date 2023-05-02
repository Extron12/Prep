package leetcode;

public class revString {
    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverse(s);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        int x =321;
        System.out.println(revInt(x));
    }
    public static void reverse(char[] s){
        int count =s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[count];
            s[count] = temp;
            count--;
        }
    }
    public static int revInt(int x){
        int val=0;
        while(x>0){
            int temp = x%10;
            x = x/10;
            val = 10*val + temp;
        }
        return val;
    }
}
