package Pattern;

public class Rhombous {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // loop for space
            for(int j = 1; j<= n-i ;j++){
                System.out.print(" ");
            }

            //loop for *
            for(int j = 1; j <= n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}