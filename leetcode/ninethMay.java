package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ninethMay {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(mat));
    }
    public static List<Integer> spiralOrder(int [][] mat){
        List<Integer> res = new ArrayList<>();
        if (mat == null || mat.length == 0) {
            return res;
        }
        int top =0; int left =0; int bottom = mat.length-1; int right = mat[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }   
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <=right){
                for(int i = bottom;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
    public static int[][] genMatrix(int n){
        int top =0; int left =0; int right =n;int bottom =0; int num=1;
        int[][] mat = new int[n][n]; 
        while((top<=bottom && left<=right) &&(num<=(n^2)) ){
            for(int i=left;i<=right;i++){
                mat[top][i] = num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mat[i][right] = num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mat[bottom][i] = num;
                    num++;
                }
                bottom--;
            }
            if(left <=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return mat;
    }
}
