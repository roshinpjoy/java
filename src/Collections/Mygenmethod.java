package Collections;

import arrays.Array;

public class Mygenmethod {

    public  static <E> void display( E[]  elements)
    {
        for(E e:elements)
        {
            System.out.println(e);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer ar[]={1,2,3,4,5,6};
        display(ar);
        Character ch[]={'c','h'};
        display(ch);





    }

}
