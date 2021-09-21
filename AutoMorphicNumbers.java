import java.util.Scanner;
public class AutoMorphicNumbers {

    private static boolean check(int n)
    {
        if(n==0) return true;
        if(n==1) return true;
        int temp=n*n;
        return temp%10 == n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        sc.close();
        if(check(n)) System.out.println("The number "+n+" is an AutoMorphic  Number ");
        else System.out.println("Its not an AutoMorphic Number ");
    }
}
