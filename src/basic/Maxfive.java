package basic;

public class Maxfive {
    public static void main(String[] args) {


        float n1 = 1, n2 = 11, n3 = 10, n4 = 4, n5 = 5;

        if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5)
            System.out.println("bigis"+n1);

        else if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5)
            System.out.println("bigis"+n2);

         else if (n3 >= n1 && n3 >= n1 && n3 >= n4 && n3 >= n5)
            System.out.println("bigis"+n3);

         else if (n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5)
            System.out.println("bigis"+n4);

        else

            System.out.println("bigis"+n5);




    }
}
