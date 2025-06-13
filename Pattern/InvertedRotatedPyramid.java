package Pattern;

public class InvertedRotatedPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            // loop for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // loop for star
            for(int j=1;j<=i;j++){
                {
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}
