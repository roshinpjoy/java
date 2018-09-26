package constructor;

public class Acco {

    int accno;
    String acctype;
    float balance;
    public Acco(int no,String type,float bal )
    {
        accno=no;
        acctype=type;
        balance=bal;
    }

    public void display()
    {
        System.out.println("accont_no"+accno);
        System.out.println("acc_type"+acctype);
        System.out.println("balance"+balance);
    }



}



