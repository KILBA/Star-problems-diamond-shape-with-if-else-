import java.util.*;

public class timepass {
    public static void main(String[] args) {
        int i,j,k,n;
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //logic
        for(i=1;i<=2*n-1;i++){           //i indicates the row, n is the maximum no. of stars, k is for spac and j is printing stars
            if(i<=n){
                for(k=n-1;k>=i;k--){
                    System.out.print(" ");
                }
                for(j=1;j<=i;j++){
                    System.out.print("* "); //space imp after '*'
                }
                System.out.println();
            }
            else{                             //here i>n, hence we do i-n in order to print the ulta triangle
                for(k=1;k<=i-n;k++){
                    System.out.print(" ");
                }
                for(j=n-1;j>=i-n;j--){
                    System.out.print("* "); //space imp after '*'
                }
                System.out.println();
            }
           
        }
    }
}
    