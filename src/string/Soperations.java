package string;

public class Soperations {
    public static void main(String[] args) {



    String name="rooshin";

    int len=name.length();
    char ch=name.charAt(len-1);
        System.out.println(ch);
        int count=0;

        for (int i=0;i<len;i++)
        {
            if (i%2!=0)
            {
                System.out.println("char at:"+i+" "+name.charAt(i));
            }

            if (name.charAt(i)=='o')
            {
                count++;


            }

        }


        System.out.println("count ofo :"+count);
}}
