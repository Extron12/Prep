package Assessment;

public class flipandInvert {
    public static void main(String[] args) {
        
    }
    public int[][] flipandInvertImage(int[][] image){
        int n = image.length;
        int[][] temp = new int [n][n];
        
        for(int i=0;i<n;i++){
            int k=n;
            for(int j=0;j<n;j++){
                temp[i][k-1] = image[i][j];
                k--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]==0){
                    temp[i][j]=1;
                }
                else temp[i][j]=0;
            }
        }
        return temp;
    }
}
