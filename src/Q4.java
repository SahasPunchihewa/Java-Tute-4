public class Q4 { // demonstrate scope and functions
    static int aValue = 5;
    public static void main(String[] args) {
        double aValue = 6;
        double bValue = 4;
        aValue=process(bValue);
        System.out.println(aValue);
    }

    private static double process(double aValue1) { //AA
        aValue = (int)aValue1 + 4;
        System.out.println(aValue);
        return aValue1;
    }
}
