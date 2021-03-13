import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        String[] words=new String[30];
        words[0]="Zero";
        words[1]="One";
        words[2]="Two";
        words[3]="Three";
        words[4]="Four";
        words[5]="Five";
        words[6]="Six";
        words[7]="Seven";
        words[8]="Eight";
        words[9]="Nine";
        words[10]="Ten";
        words[11]="Eleven";
        words[12]="Twelve";
        words[13]="Thirteen";
        words[14]="Fourteen";
        words[15]="Fifteen";
        words[16]="Sixteen";
        words[17]="Seventeen";
        words[18]="Eighteen";
        words[19]="Nineteen";
        words[20]="Twenty";
        words[21]="Thirty";
        words[22]="Forty";
        words[23]="Fifty";
        words[24]="Sixty";
        words[25]="Seventy";
        words[26]="Eighty";
        words[27]="Ninety";
        words[28]="Hundred";
        words[29]="Thousand";

        System.out.println("Enter Amount :");
        Scanner sc=new Scanner(System.in);
        float cash=sc.nextFloat();

        String number=String.valueOf(cash);

        String numbers[]=number.split("\\.");

        loopAmount(words,Integer.parseInt(numbers[0]));
        System.out.print("Dollars And ");
        loopAmount(words,Integer.parseInt(numbers[1]));
        System.out.print("Cents.");
    }
    public static void loopAmount(String words[],int amount)
    {
        while(amount>0)
        {
            if(amount>=1000)
            {
                int num=(int)amount/1000;
                amountPrint(words,num);
                System.out.print(words[29]+" ");
                amount=amount-num*1000;
            }
            else if(amount>=100)
            {
                int num=(int)amount/100;
                amountPrint(words,num);
                System.out.print(words[28]+" ");
                amount=amount-num*100;
            }
            else if(amount>=10)
            {
                if(amount<20)
                {
                    switch (amount)
                    {
                        case 11:
                            System.out.print(words[11]+" ");
                            break;
                        case 12:
                            System.out.print(words[12]+" ");
                            break;
                        case 13:
                            System.out.print(words[13]+" ");
                            break;
                        case 14:
                            System.out.print(words[14]+" ");
                            break;
                        case 15:
                            System.out.print(words[15]+" ");
                            break;
                        case 16:
                            System.out.print(words[16]+" ");
                            break;
                        case 17:
                            System.out.print(words[17]+" ");
                            break;
                        case 18:
                            System.out.print(words[18]+" ");
                            break;
                        case 19:
                            System.out.print(words[19]+" ");
                            break;
                    }
                    amount=0;
                }
                else
                {
                    int num=(int)amount/10;
                    switch (num)
                    {
                        case 1:
                            System.out.print(words[10]+" ");
                            break;
                        case 2:
                            System.out.print(words[20]+" ");
                            break;
                        case 3:
                            System.out.print(words[21]+" ");
                            break;
                        case 4:
                            System.out.print(words[22]+" ");
                            break;
                        case 5:
                            System.out.print(words[23]+" ");
                            break;
                        case 6:
                            System.out.print(words[24]+" ");
                            break;
                        case 7:
                            System.out.print(words[25]+" ");
                            break;
                        case 8:
                            System.out.print(words[26]+" ");
                            break;
                        case 9:
                            System.out.print(words[27]+" ");
                            break;
                    }
                    amount=amount-num*10;
                }
            }
            else if(amount>0)
            {
                amountPrint(words,amount);
                amount=0;
            }
        }
    }
    public static void amountPrint(String words[],int num)
    {
        switch (num)
        {
            case 1:
                System.out.print(words[1]+" ");
                break;
            case 2:
                System.out.print(words[2]+" ");
                break;
            case 3:
                System.out.print(words[3]+" ");
                break;
            case 4:
                System.out.print(words[4]+" ");
                break;
            case 5:
                System.out.print(words[5]+" ");
                break;
            case 6:
                System.out.print(words[6]+" ");
                break;
            case 7:
                System.out.print(words[7]+" ");
                break;
            case 8:
                System.out.print(words[8]+" ");
                break;
            case 9:
                System.out.print(words[9]+" ");
                break;
        }
    }
}
