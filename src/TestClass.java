class TestClass{
    int number;
    void testMethod(TestClass t)
    {
        t.number=25;
        System.out.println("Inside the Testclass, test method "+ t.number);
    }
}
