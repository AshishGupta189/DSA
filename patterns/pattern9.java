import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input : ");
        int n = sc.nextInt();
        int m = (2*n-1)/2;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n-1;j++){
                if (i<n){
                    if (j>=m-i&&j<=m+i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j>=i-n&&j<3*n-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
