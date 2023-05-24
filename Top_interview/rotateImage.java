package Top_interview;

public class rotateImage {
    public static void main(String[] args) {
        
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(mat);
    }
    public static void rotate(int[][] mat){
        int n = mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
    
        for(int i=0;i<n;i++){
            int left =0;
            int right =n-1;
            while(left<right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(mat[0][0]);
    }
}
