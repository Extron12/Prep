package Top_interview;

public class validPali {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPali(String s){
        String fin ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                return false;
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                fin+=s.charAt(i);
            }
            else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                char st = (char)(s.charAt(i)+32);
                fin+=st;
            }
            
        }
        fin.toLowerCase();
        int j =fin.length()-1;
        for(int i =0;i<fin.length();i++){
            if(i<j){
                if(fin.charAt(i)!=fin.charAt(j)){
                    return false;
                }
                j--;
            }
        }

        return true;
    }
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int last =s.length()-1;
        while(start<=last){
            char fir = s.charAt(start);
            char las = s.charAt(last);
            if(!Character.isLetterOrDigit(fir)){
                start++;
            }
            else if(!Character.isLetterOrDigit(las)){
                last--;
            }
            else{
                if(Character.toLowerCase(fir)!=Character.toLowerCase(las)){
                    return false;
                }
                start++;
                last--;
            }

        }
        return true;

    }
}
