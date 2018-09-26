package file;

import java.io.*;

public class Filedemo {
    public static void main(String[] args) throws IOException {
       // File f=new File("file"); create cheyyanooooo
        FileOutputStream ot=new FileOutputStream("fg",true);
       BufferedOutputStream bout=new BufferedOutputStream(ot);
       /*BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("file",true),60);*/
        String s="diiiiiiiiiiii ";
         bout.write(s.getBytes());
         bout.flush();
        //System.out.println("success");

       /* FileInputStream fn=new FileInputStream("file");
        BufferedInputStream bin=new BufferedInputStream(fn);*/
       BufferedInputStream bin=new BufferedInputStream(new FileInputStream("file"),60);
        int i=0;
        while ((i=bin.read())!=-1)
        {
            System.out.print((char)i);//integer to character

        }



        int avail=bin.available();
        System.out.println(avail);







    }
}
