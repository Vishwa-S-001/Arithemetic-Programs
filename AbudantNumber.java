import java.util.Scanner;
public class AbudantNumber {
    private static boolean check(int n)
    {
        if(n==0 || n==1) return false;
        int sum=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) sum+=i;
        }
        return sum > n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        sc.close();
        if(check(n)) System.out.println("The number "+n+" is an Abudant Number ");
        else System.out.println("Its not an Abudant Number ");
    }
}
