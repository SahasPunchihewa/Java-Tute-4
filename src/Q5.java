public class Q5
{
    private static double processA(double Sum, int Count) {
        double newAnswer = Sum + (double) Count;
        return newAnswer;
    }
    private static double processA(int Sum, double Count) {
        double newAnswer = (double) Sum * Count;
        return newAnswer;
    }

    public static void main(String[] args)
    {

        double Num1 = 3.0;
        int Num2 = 2;
        double total;
        total = processA( Num1, Num2);
        System.out.println(total);

    }

}
