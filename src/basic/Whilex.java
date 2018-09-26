package basic;

import java.util.Scanner;

class Whilex {
    public static void main(String args[]){
        System.out.println("enter");
        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        while(i>1){
            System.out.println(i);
            i--;
        }


    }
}