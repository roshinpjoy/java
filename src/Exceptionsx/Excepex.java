package Exceptionsx;

public class Excepex {
    public static void main(String[] args) {



        int a=10;
        int b=2;
       int c=1;
        String s=null;
        String sf="ser";
        int ar[]=new int[5];


        try {
          //  ar[6]=10;
            // int f=Integer.parseInt(sf);
          // c = a / b;
          //  System.out.println(c);
            System.out.println(s.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("array index");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number format exception");
        }
        catch (Exception e)
        {
            System.out.println("Exception handled"+e);

        }
        System.out.println(c);

    }
}
