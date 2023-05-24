package Top_interview;

public class lengthLastWord {
    public static void main(String[] args) {
        
    }
    public int lengthOfLastWord(String s){
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
