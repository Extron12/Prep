package leetcode;


public class uniqueChar {
    public static void main(String[] args) {
        String str = "abccbaacz";
        uniqueChar obj = new uniqueChar();
        char ans = obj.repeatedCharacter(str);
        System.out.println(ans);

    }
    public int firstUniqChar(String s){
        int arr[] = new int[26];

        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            arr[val-97]++;
        }
        int  ans=0;
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if(arr[val-97]==1){
                ans = i;
                break;
            }
            else {
                ans = -1;
            }
        }

        
        return ans;
    }

    public char repeatedCharacter(String s) {
        int arr[] = new int[26];
        char ans = ' ';
        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)-'a']++;

            if(arr[s.charAt(i)-97]==2){
                ans = s.charAt(i);
                break;
            }
        }
        
        return ans;
    }

    



}
