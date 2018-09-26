package basic;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Account ac1=new Account();
        Account ac3=new Account();
        Scanner sc=new Scanner(System.in);
        ac3.gett();





        ac1.accno=123;
        ac1.acctype="savings";
        ac1.balance=20000;
        ac1.display(ac1);

       /* System.out.println("acctype"+ac1.acctype);
        System.out.println("accno"+ac1.accno);
        System.out.println("balance"+ac1.balance);*/

        Account ac2=new Account();
        ac2.accno=124;
        ac2.acctype="current";
        ac2.balance=50000;
        ac2.display(ac2);
       /*// System.out.println("accno"+ac2.accno);
        System.out.println("acctype"+ac2.acctype);
        System.out.println("accno"+ac2.accno);
        System.out.println("balance"+ac2.balance);*/





    }
}
