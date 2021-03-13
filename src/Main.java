public class Main {

    public static void testMethod(int number)
    {
        number = 25;
        System.out.println("Inside the testMethod "+ number );
    }


    public static void main(String[] args) {
        //scenario 1
        int number=45;
        testMethod(number);
        System.out.println("Inside the main method "+ number);

        //scenario 2
        TestClass t=new TestClass();//object initialization
        t.number=45;
        t.testMethod(t);
        System.out.println("Inside the Main Method "+t.number);

    }
}
