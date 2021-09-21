import java.util.Scanner;
class Main 
{
    private static boolean check(int n)
    {
        // 153 371 403.....
        int temp=n,sum=0;
        while(temp>0)
        {
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }
        if(n==sum) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        sc.close();
        if(check(n)) System.out.println("The number "+n+" is an Armstrong Number ");
        else System.out.println("Its not an armstrong Number ");
    }
}