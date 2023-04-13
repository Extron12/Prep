package leetcode;

public class increDecre {
    public static void main(String[] args) {
        String op[] = {"X++","++X","--X","X--"};
        int sol = finalValue(op);
        System.out.println(sol);
    }
    public static int finalValue(String[] op){
        int count = 0;
        for(int i=0;i<op.length;i++){
            if(op[i] == "--X" || op[i] == "X--"){
                count--;
            }
            else count++;
        }
        return count;
    }
}
