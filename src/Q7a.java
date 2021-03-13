import java.util.Scanner;

public class Q7a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number=sc.nextInt();
        int sum=number;
        System.out.print(number+"! = "+number+" x ");
        for(int i=number-1;i>0;i--)
        {
            if(i>1)
            {
                System.out.print(i + " x ");
            }
            else
            {
                System.out.print(i);
            }
            sum=sum*i;
        }
        System.out.print(" = "+sum);
    }
}
