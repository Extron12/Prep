package leetcode;

public class strStr {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        strStr obj = new strStr();
        int num = obj.strstr(haystack, needle);
        System.out.println(num);
    }

    public int strstr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
