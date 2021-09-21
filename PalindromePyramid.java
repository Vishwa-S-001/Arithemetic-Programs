import java.util.Scanner;
public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        sc.close();
        //int t;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int rev=i-1;rev>=1;rev--)
            {
                System.out.print(rev+" ");
            }
            System.out.println();
        }
    }
}
