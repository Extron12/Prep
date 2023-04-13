package leetcode;

public class validAna {
    public static void main(String[] args) {
        
    }

    public boolean isAnagram(String s, String t){
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        if(s.length()==t.length()){
            for(int i=0;i<t.length();i++){
                if(arr[t.charAt(i) - 'a'] >= 1){
                    arr[t.charAt(i) - 'a']--;
                }
            }
            
        }
    }
}
