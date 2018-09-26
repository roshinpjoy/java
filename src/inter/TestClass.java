package inter;

// A simple program to Test Interface default
// methods in java
interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }


}

class TestClass implements TestInterface
{
   /* @Override
    public void show() {
        System.out.println("show inside Test class");
    }*/
    // implementation of square abstract method
    public void square(int a)

    {
        System.out.println(a*a);
    }


}