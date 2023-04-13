package leetcode;
import java.util.*;

public class commonChar {
    public static void main(String[] args) {
        String ar[] = {"cool","lock","cook"};
        commonChar obj = new commonChar();
        List<String> sol = obj.common(ar);

        System.out.println(Arrays.toString(sol.toArray()));
    }
    public List<String> common(String[] words){
        List<String> ans = new ArrayList<String>();
        int [] dic = new int[26];
        for (int i=0;i<words[0].length();i++){
            dic[words[0].charAt(i) - 'a']++;
        }

        for (int i=1;i<words.length;i++){
            int [] curr = new int[26];
            for(int j=0; j<words[i].length();j++){
                curr[words[i].charAt(j) - 'a']++;
            }

            for(int j=0;j<26;j++){
                if(curr[j]<dic[j]) dic[j] = curr[j];
            }
        }
        for(int i =0;i<25;i++){
            for(int j=0;j<dic[i];j++){
                ans.add(Character.toString((char) ('a'+i)));
            }
        }
        return ans;

    }
}
