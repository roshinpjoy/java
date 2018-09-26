package arrays;

public class ArrayEx {
    public static void main(String[] args) {
        //int a[] ={10,20,30,40};

        int a[]; //declaration

        a=new int[] {10,20,30};//instantiation

       /* a[0]=10;
        a[2]=20;
        a[4]=40;*/

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


        System.out.println("Enhanced For Loop:");



        for(int j:a)

            System.out.println(j);



    }
}
