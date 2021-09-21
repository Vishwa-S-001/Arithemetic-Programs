import java.util.Scanner;
public class StrongNumber {

    private static boolean check(int n)
    {
        int temp=n,sum=0;
        while(temp>0)
        {
            sum+=fact(temp%10);
            temp/=10;
        }
        if(sum==n) return true;
        return false;
    }
    private static int fact(int x)
    {
        if(x==0 || x==1) return 1;
        if(x==2) return x;
        int fact=1;
        for(int i=x;i>=2;i--)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        sc.close();
        if(check(n)) System.out.println("The number "+n+" is an Strong Number ");
        else System.out.println("Its not an Strong Number ");
    }
}
