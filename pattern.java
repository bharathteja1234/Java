import java.util.*;
class pattern {
    public static void main(String[] args) {
        int n,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of rows");
        n=s.nextInt();
        for(i=n;i>=1;i--) {
            for (j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(j=0;j<=n-i;j++) {
                System.out.print(" *");
            }
            System.out.println( );
        }


    }
}
