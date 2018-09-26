package statics;

class Estatic
{
    int length=10,n;
    int breadth=10;
    int height=10;
    public static int num=0;
    public static int NoOfCubes()
    {
        return num;
    }
    public int Demo()
    {
        n=num+2;
        return n ;
    }

    public static void main(String args[])
    {
        Estatic e=new Estatic();
        int i=e.Demo();
        System.out.println("out  "+i);

        System.out.println("Number of cube objects =" +num);

        System.out.println("Number of cube objects=" +NoOfCubes());

    }




}


