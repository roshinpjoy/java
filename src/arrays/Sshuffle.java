package arrays;

import java.util.Arrays;
import java.util.Random;

public class Sshuffle {

        public static void main(String[] args) {
            int ar[]={10,20,40,30,15};
            int n=ar.length;

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();*/
            Random rn = new Random();

            for(int i=1;i<ar.length;i++) {
                int temp=0;
                int ind=rn.nextInt(i);
                //System.out.println(ar);
                temp=ar[ind];
                 System.out.println("Temp:"+temp);
                ar[ind]=ar[i];
                System.out.println("Ar[ind]:"+ar[ind]);
                ar[i]=temp;
                System.out.println("Ar[i]:"+ar[i]);



            }
            System.out.println(Arrays.toString(ar));
        }

    }










