package leetcode;

public class eightMay {
    public static void main(String[] args) {
        int mat[][] = {{5}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int [][] mat){
        int sum =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum = sum+mat[i][j];
                    System.out.println("sum value in first loop :"+sum);
                }
                else if((i+j)==mat.length-1 && i!=j){
                    sum = sum+mat[i][j];

                    System.out.println("sum value in secondloop :"+sum);
                }
            }
        }
        return sum;
    }
}
