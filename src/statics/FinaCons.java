package statics;

public  class FinaCons{
        static final int a;//we can only initialize its value in static block
        final int b=70;

        static
        {   a=20;
            System.out.println("a:"+a);
        }


        FinaCons(){

           //a=67;//only initialised through static block
            System.out.println("B:"+b);
        }

        public static void main(String[] args) {
             //a=20;
            System.out.println(FinaCons.a);


            FinaCons ob = new FinaCons();
            int e=ob.b+1;
            System.out.println(e);

        }
    }

