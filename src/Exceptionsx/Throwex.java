package Exceptionsx;

public class Throwex {

    public static void  eligibility( int age,int size) {
        if(age<10&&size<10)
        {
            throw new  ArithmeticException("not allowed");
        }
        else {
            System.out.println("not valid");
        }
    }

    public static void main(String[] args)

    {
        eligibility(9,6);
    }










}
