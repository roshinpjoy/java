package arrays;

import java.util.Scanner;

public class Arrayoccu {

    public static void main(String[] args) {

        int ar[]=new int[]{1,2,3,2,2,2,4,5,6};
        int nm=0;

        System.out.println("Enter element ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number of occurances are");

        for (int i=0;i<ar.length;i++)
        {
            if (num==ar[i])
                nm++;


        }

        System.out.println(nm);


    }


}
