package leetcode;

public class validAna {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        validAna obj = new validAna();
        boolean val = obj.isAnagram(s, t);

        System.out.println(val);
    }

    public boolean isAnagram(String s, String t){
        int[] arr = new int[26];
        boolean sol = true;
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;   
        }
        

        if(s.length()==t.length()){
            for(int i=0;i<t.length();i++){
                if(arr[t.charAt(i) - 'a'] >= 1){
                    //System.out.println(arr[t.charAt(i) - 'a']+"First exec");

                    arr[t.charAt(i) - 'a']--;
                    //System.out.println(arr[t.charAt(i) - 'a'] + "Second exec");

                }
                //System.out.println(arr[i] + "Third exec");
            }
            
        }
        else sol = true;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sol= false;
            }

            //System.out.println(arr[i]);
        }
        return sol;
    }
    public boolean betterSol(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
