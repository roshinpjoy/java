package arrays;

public class Array {

    public static void main(String[] args) {

        int temp;

        int ss[] ={1,10,4,6,8};

      /*  ss[0]=10;
        ss[1]=20;
        ss[2]=60;
        ss[3]=70;
        ss[4]=50;*/



        System.out.println("array elements are");
        for(int i=0;i<ss.length;i++)
        {
            System.out.println(ss[i]);
        }



        System.out.print("Numbers in Ascending Order:");

        for(int i=0;i<ss.length;i++)
        {
            for(int j=i+1;j<ss.length;j++)
            {

                if (ss[i] > ss[j])
                {
                    temp = ss[i];
                    ss[i] = ss[j];
                    ss[j] = temp;
                }


            }
        }


        System.out.println("sorted elements are");

        for(int i=0;i<ss.length;i++)
        {
            System.out.println(ss[i]);
        }


    }
}
