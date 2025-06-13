package Pattern;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<= n; i++){
            //loop for star
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            //loop for space
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //loop for star
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>= 1; i--){
            //loop for star
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            //loop for space
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //loop for star
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
