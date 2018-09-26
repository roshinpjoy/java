package basic;

public class Swapping {


        int x ;
        int y ;

        public Swapping(int a,int b)
        {
         x=a;
         y=b;
        }

        void display()
        {

            System.out.println("Before basic.Swapping");
            System.out.println("Value of x is :" + x);
            System.out.println("Value of y is :" + y);
            x = x + y;
            y = x - y;
            x = x - y;

            System.out.println("Before basic.Swapping");
            System.out.println("Value of x is :" + x);
            System.out.println("Value of y is :" + y);
        }

        //add both the numbers and assign it to first



    }
