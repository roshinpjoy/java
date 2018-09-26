package last;

 class Bank {

    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.getdetails(ac1);
        ac1.display(ac1);


        Account ac2=new Account();
       ac2.detail(ac2);
        ac2.display(ac2);

    }
}


 class Account {

    int accno;
    String acctype;
    float balance;

    public  void getdetails(Account a1)
    {
        a1.accno=100;
        a1.acctype="bbb";
        a1.balance=70000;

    }

    public  void detail(Account a2)
    {
        a2.accno=200;
        a2.acctype="ccc";
        a2.balance=80000;

    }


    public void display(Account ac)
    {
        System.out.println("accont_no"+ac.accno);
        System.out.println("acc_type"+ac.acctype);
        System.out.println("balance"+ac.balance);
    }

}
