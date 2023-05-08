package leetcode;

public class fifthMay {
    public static void main(String[] args) {
        String s ="leetcode";
        int k =3;
        System.out.println(maxVow(s, k));
    }
    public int maxVowels(String s, int k){
        String str = "";
        for(int i=0;i<k;i++){
            str +=s.charAt(i);
        }
        int count=0;
        for(int i=k;i<s.length();i++){
            int c =0;
            for(int j=0;j<str.length();i++){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                    c++;
                }
            }
            str = str.substring(1, str.length());
             
            count = Math.min(count, c);
        }
        return count;
    }
    public static int maxVow(String s, int k){
        int count = 0;
        
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ){
                count++;
            }
        }
        int ans = count;
        for(int i=1;i<s.length()-k+1;i++){
            System.out.println("Removed : "+s.charAt(i-1)+" added : "+s.charAt(i+k-1));
            if(s.charAt(i+k-1)=='a' || s.charAt(i+k-1)=='e' || s.charAt(i+k-1)=='o' || s.charAt(i+k-1)=='i' || s.charAt(i+k-1)=='u' ){
                count++;
            }
            if(s.charAt(i-1)=='a' || s.charAt(i-1)=='e' || s.charAt(i-1)=='o' || s.charAt(i-1)=='i' || s.charAt(i-1)=='u' ){
                count--;
            }
            if(ans<count){
                ans = count;
            }
        }
        return ans;
    }
}
