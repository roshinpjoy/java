package constructor;

class Consex2 {
        int value1;
        int value2=200;

        Consex2() {
            value1 = 10;
            value2 = 20;
            System.out.println("First constructor");
        }

        Consex2(int a) {
            value1 = a;
          // System.out.println(value2);
            System.out.println("Second constructor");
        }

        Consex2(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
            System.out.println("Third constructor");
        }

        public void display() {
            System.out.println("Value1=" + value1);
            System.out.println("Value2=" + value2);
        }
    }

        class mainn
        {
        public static void main(String args[])
        {
            Consex2 d1= new Consex2();
            Consex2 d2=new Consex2(30);
            Consex2 d3= new Consex2(30,40);
            d1.display();
            System.out.println(" ");
            d2.display();
            System.out.println(" ");
            d3.display();
        }
    }


