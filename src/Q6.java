import java.util.Scanner;

public class Q6
{
    public static void main (String[] args)
    {
        System.out.println("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        StringBuffer buf=new StringBuffer(input);
        buf.reverse();
        String rev=String.valueOf(buf);
        System.out.println(input.equals(rev));
    }
}
