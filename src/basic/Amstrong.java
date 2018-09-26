package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Armstrong{



        static void ams( int n)
        {
            int c=0,a,temp;
            //int n=inp;//It is the number to check armstrong
            temp=n;
            while(n>0)
            {
                a=n%10;
                n=n/10;
                c=c+(a*a*a);
            }
            if(temp==c)
                System.out.println("armstrong number");
            else
                System.out.println("Not armstrong number");
        }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter \n");
        int p=Integer.parseInt(br.readLine());
        ams(p);
    }
}