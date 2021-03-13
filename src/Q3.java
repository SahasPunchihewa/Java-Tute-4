import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        int number =0;
        int power =0 ;
        int count =0;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();
        System.out.println("Enter power ");
        power = input.nextInt();
        count = 0;
        while (count < power )
        {
            total =total*number ;
            System.out.println(total);
            count++;
        }
        System.out.println(" the answer is " + total);

    }
}
