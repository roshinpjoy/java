package arrays;


public class Arracopy {
    public static void main(String[] args) {
        int a[] = {3,343,23,32,23};

        System.out.println("First Array Value:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        int b[]=a;

        System.out.println("Second Array:");
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }

        int c[]=new int[10];

        System.arraycopy(b,0,c,0,5);
        System.out.println();

        System.out.println("Third Array:");
        for(int i=0;i<5;i++){
            System.out.println(c[i]);
        }

        /*int d[] = Arrays.copyOf(b,5);
       // int[] arr2 = Arrays.copyOf(arr1, 5);

        System.out.println("Fourth Array:");
        for(int i=0;i<5;i++){
            System.out.println(d[i]);
        }*/



    }
}


