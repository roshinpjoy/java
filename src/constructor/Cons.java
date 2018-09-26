package constructor;

class A
{
    A()
    {
        System.out.println("A default constructor call");
    }

    A(int a)
    {
        System.out.println(a);
        System.out.println("A class parameterized constructor call");
    }
}

class B extends A
{
    B()
    {
       // super();
        System.out.println("B class default constructor call");
    }

    B(int b)
    {
        super(10);
        System.out.println(b);
        System.out.println("B class parameterized constructor call");
    }
}

class Cons
{
    public static void main(String args[])
    {

        A a1=new A(10);
        System.out.println(".......................");
        A a2=new A();
        System.out.println(".......................");
        B r3=new B();
        System.out.println(".......................");
        B r2= new B(12);
        System.out.println(".......................");
        A a5=new B(5);
        System.out.println(".......................");
        A a6=new B();
        /*B a9=new  A();//in compactible types*/




    }
}