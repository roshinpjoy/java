package arrays;

public class Arraysplit {


    public static void main(String[] args) {
        int splitt[]=new int[] {10,20,70,50,60};
        int n=splitt.length;
        int a[]=new int[n/2];
        int b[]=new int[n-a.length];

        for (int i=0;i<n;i++)
        {
            if(i<a.length)
            {
                a[i]=splitt[i];

            }
            else
            {
                b[i-a.length]=splitt[i];
            }
        }

        System.out.println("Arrays in A[i]");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
        System.out.println("Arrays of B[i]");
        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }






    }
}
