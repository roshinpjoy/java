package Exceptionsx;

public class Ex1 {
    public static void main(String[] args)
    {
        int ar[]=new int[ ] {1,2,3,4,5};
        try {
            System.out.println(ar[7]);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("handled");
        }
    }
}
