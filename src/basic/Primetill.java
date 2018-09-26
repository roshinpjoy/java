package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prime
{
    static  void  prime(int n)
    {


        System.out.println("Prime numbers are: ");
        for(int i=1;i<=n;i++)
        {

            int p=0;
          //  System.out.println("value of p "+p);
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    p++;
           //   System.out.println("value of p "+p);

            }
           if(p==2)
               System.out.print(" prime  "+i+"\n");

        }
    }



    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value: ");
        int n=Integer.parseInt(br.readLine());
        prime(n);

}
}