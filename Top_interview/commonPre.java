package Top_interview;

public class commonPre {
    public static void main(String[] args) {
        String[] str = {"dog","racecar","car"};
        String sol = longestPre(str);
        System.out.println(sol);
    }

    public static String longestPre(String[] str){
        int n = str.length;
        int min=str[0].length();
        for(int i=1;i<n;i++){
            if(min>str[i].length()){
                min = str[i].length();
            }
        }
        String res = "";
        for(int i=0;i<min;i++){
            char ch = str[0].charAt(i);
            for(int j=1;j<n;j++){
                if(ch!=str[j].charAt(i)){
                    return res;
                }
            }
            res +=ch;
        }
        return res;
    }
}
