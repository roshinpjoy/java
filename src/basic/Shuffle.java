package basic;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {


        Random r = new Random();

        for (int i = 0; i < 5; i++)

        {
            int num = r.nextInt(5000);
            System.out.println(num);
        }

    }



}
