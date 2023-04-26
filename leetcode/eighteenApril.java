package leetcode;

public class eighteenApril {
    public static void main(String[] args) {
        String word1 = "cdf";
        String word2 = "a";
        eighteenApril obj = new eighteenApril();
        String result = obj.mergeAlt(word1, word2);
        System.out.println(result);
    }
    public String mergeAlt(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        int rec=word1.length();
        if(len1<len2){
            rec = len1;
        }
        else if(len1>len2){
            rec = len2;
        }
        String res = "";
        //System.out.println(rec);
        for(int i=0;i<rec;i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
            //System.out.println("exec");
        }
        if(rec<word1.length()){
            res+= word1.substring(rec);
        }
        else if(rec<word2.length()){
            res+= word2.substring(rec);
        }
        
        return res;
    }
}
