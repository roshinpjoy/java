package statics;

public class Sblock {

    static
    {
        System.out.println("static initialised");

    }

    public static  void m()
    {
        System.out.println("static method");

    }

    public static void main(String[] args) {


        System.out.println("in main method");
        m();
    }



}
