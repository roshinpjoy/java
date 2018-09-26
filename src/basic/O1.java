package basic;

class O1
{
    int data=50;

    void change(int data){
        data=data+100;
    }


    public static void main(String args[])
    {
        O1 o=new O1();

        System.out.println("before change "+o.data);
        o.change(100);
        System.out.println("after change "+o.data);

    }
}
