public class Staircase {


    public static void staircase(int n) {
        System.out.println("n->>"+n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
