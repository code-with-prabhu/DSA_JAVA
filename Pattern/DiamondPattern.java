package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<= n ;i++){
            // loop for space
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            // loop for stars
            for(int j = 1; j<= 2*i -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//downward 
        for(int i =n; i>= 1 ;i--){
            // loop for space
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            // loop for stars
            for(int j = 1; j<= 2*i -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
