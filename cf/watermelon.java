package cf;
import java.util.*;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val%2==0 && val>3){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
    