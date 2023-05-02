package Top_interview;

import java.util.HashMap;

public class uniqueString {
    public static void main(String[] args) {
        
    }
    public int firstUniq(String s){
        HashMap<Character, Integer> dic = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!dic.containsKey(s.charAt(i)))
            dic.put(s.charAt(i),1);
            else dic.put(s.charAt(i),dic.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++){
            if(dic.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
