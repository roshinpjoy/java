package basic;

import java.util.Scanner;

public class Account {

    int accno;
    String acctype;
    float balance;

    public void display(Account di)
    {
        System.out.println("accont_no"+di.accno);
        System.out.println("acc_type"+di.acctype);
        System.out.println("balance"+di.balance);
    }

    public void dis()
    {
        System.out.println("accont_no"+accno);
        System.out.println("acc_type"+acctype);
        System.out.println("balance"+balance);
    }
    public void gett() {
        for(int i=0;i<5;i++) {


            Scanner sc = new Scanner(System.in);
            System.out.println("enter accno");
            accno = sc.nextInt();
            System.out.println("enter acctype");
            acctype = sc.next();
            System.out.println("enter balance");
            balance = sc.nextInt();
            dis();
        }
    }


}



