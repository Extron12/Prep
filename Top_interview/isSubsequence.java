package Top_interview;

public class isSubsequence {
    public static void main(String[] args) {
        
    }
    public boolean isSubsequences(String s, String t){
        int count=0;
        int tec =0;
        for(int i=0;i<s.length();i++){
            for(int j=tec;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){
                    tec =j;
                    count++;
                }
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
