package scanner;


import java.util.Scanner;
public class Scanx {

    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.getdetails();
        ac1.display(ac1);



    }
}


class Account {

    int accno;
    String acctype;
    float balance;

    public  void getdetails()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("accont_no");
        this.accno=sc.nextInt();
        System.out.println("acctype");
        this.acctype=sc.nextLine();

        System.out.println("balance");
        this.balance=sc.nextInt();

    }




    public void display(Account ac)
    {
        System.out.println("accont_no"+ac.accno);
        System.out.println("acc_type"+ac.acctype);
        System.out.println("balance"+ac.balance);
    }

}
