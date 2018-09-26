package inter;

public  class Mtest implements TestInterface {
    @Override
    public void square(int a) {
        System.out.println(a*a*a);

    }

    @Override
    public void show() {
        System.out.println("show inside Mtest");
    }
    public static void main(String args[])
    {
        TestInterface tc=new TestClass();
        new TestClass().square(10);

        tc.show();
        tc.square(5);
        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        TestInterface tc1=new Mtest();
        tc1.square(8);
        tc1.show();

        // default method executed


    }


}
