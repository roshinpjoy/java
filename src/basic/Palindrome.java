package basic;

public class Palindrome {
    public static void main(String[] args) {

        String s = "121";
        String rev="";
        //char a[] = s.toCharArray();
        //char b[] = a;


        int i=0;
        for (i = s.length() - 1; i >= 0; i--)

        {

           rev= rev+s.charAt(i);
        }


        if(rev.equals(s))
            System.out.println("Is basic.Palindrome");
        else
            System.out.println("Not basic.Palindrome");


    }
}
