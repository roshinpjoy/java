package oride;// A Simple Java program to demonstrate
// Overriding and Access-Modifiers

class Oridemodi
{
    private int  id=10;
    // private methods are not overridden
    private void m1() { System.out.println("From parent m1()");}

    protected void m2() { System.out.println("From parent m2()"); }//we cant put here public
}

class Child extends Oridemodi
{
    // new m1() method
    // unique to Child class
    private void m1() { System.out.println("From child m1()");}

    // overriding method
    // with more accessibility
    @Override
    public void m2() { System.out.println("From child m2()");}//cant put here protected

}

// Driver class
class Main
{
    public static void main(String[] args)
    {

        Oridemodi obj1 = new Oridemodi();
        obj1.m2();
        Oridemodi obj2 = new Child();
        obj2.m2();
    }
}
