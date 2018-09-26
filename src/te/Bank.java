package te;

class Account
{
    int accno;
    String acctype;
    float balance;

    void details(int accno,String acctype,float balance)
    {
       accno=accno;
       acctype=acctype;
       balance=balance;

    }

    void display()
    {
        System.out.println(accno);
        System.out.println(acctype);
        System.out.println(balance);
    }

}

public class Bank {

    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.details(10,"ros",50000);
        ac1.display();

        Account ac2=new Account();
        ac2.details(11,"er",30000);
        ac2.display();


    }
}


