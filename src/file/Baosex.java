package file;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Baosex {
    public static void main(String[] args)  throws IOException {
        FileOutputStream f1=new FileOutputStream("f1",false);
        FileOutputStream f2=new FileOutputStream("f2",true);
        FileOutputStream f3=new FileOutputStream("f3",true);
        FileOutputStream f4=new FileOutputStream("f6",true);

        String s="welldone";
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(s.getBytes());
        bout.writeTo(f1);
        bout.writeTo(f2);
        bout.writeTo(f3);
        bout.writeTo(f4);
        bout.flush();


        FileInputStream in=new FileInputStream("f1");
        FileInputStream in1=new FileInputStream("f2");
        FileInputStream in2=new FileInputStream("f3");
        FileInputStream in3=new FileInputStream("f4");

       /* SequenceInputStream sin=new SequenceInputStream(in,in2);

        int i=0;

        while ((i=sin.read())!=-1)
        {
            System.out.print((char)i);
        }*/




        Vector v=new Vector();
        v.add(in);
        v.add(in1);
        v.add(in2);
        v.add(in3);

        Enumeration e=v.elements();

        SequenceInputStream sin=new SequenceInputStream(e);

        int i=0;

        while ((i=sin.read())!=-1)
        {
            System.out.print((char)i);
        }





        System.out.println("success");

    }
}
