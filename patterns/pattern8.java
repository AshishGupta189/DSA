import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input : ");
        int n = sc.nextInt();
        int m = (2*n-1)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j>=i&&j<n+n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
