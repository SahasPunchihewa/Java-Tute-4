import java.util.Scanner;

public class Q7b
{
    static int num,sum;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        num=sc.nextInt();
        sum=num;
        System.out.print(num+"! = "+num+" x ");
        num--;
        fac();
        System.out.print(" = "+sum);
    }
    public static void fac()
    {
        if(num>1)
        {
            System.out.print(num + " x ");
        }
        else
        {
            System.out.print(num);
        }
        sum=sum*num;
        num--;
        if(num!=0)
        {
            fac();
        }
    }
}
