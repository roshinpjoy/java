package basic;

class sumfnum
{
    public static void main(String a[])
    {

        addition d = new addition();
        d.calc();




    }
}

class addition
{

    void calc()
    {
        int n=10;
        int sum=0;
        System.out.println("Sum="+sum);
        for(int i=0;i<n;i++)
        {

            sum=sum+1;
            System.out.println("sum="+sum);
        }
        //return ;


    }

}