package Pattern;

public class HollowRhombous {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // loop for space
            for(int j = 1; j<= n-i ;j++){
                System.out.print(" ");
            }

            //loop for *
            for(int j = 1; j <= n ;j++){
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");    
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
