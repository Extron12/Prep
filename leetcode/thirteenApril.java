package leetcode;

import java.util.Stack;

public class thirteenApril {
    public static void main(String[] args) {
        int pushed[] = {1,2,3,4,5};
        int popped[] = {4,3,5,1,2};

        thirteenApril obj = new thirteenApril();
        boolean val = obj.validateStackSequences(pushed, popped);
        System.out.println(val);
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> val = new Stack<>();

        int l=0;
        for (int i : pushed){
            val.push(i);
            while(!val.empty() && val.peek() == popped[l]){
                val.pop();
                l++;
            }
        }
        return val.empty();
    }
}
