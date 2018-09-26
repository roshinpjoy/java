package file;

import java.io.*;

public class Writechar {
    public static void main(String[] args) throws IOException {
        File F=new File(("second"));
      //  Writer w=new FileWriter(F,true);
       FileWriter w=new FileWriter(F);
       BufferedWriter wr=new BufferedWriter(w);
       char ch[]=new char[]{'a','b','c','d'};
        wr.write(ch);
        wr.flush();
        w.write("welcow");
        w.write(65);
        w.close();//any thing we can give


        //FileReader fr=new FileReader(("second"));
        BufferedReader br=new BufferedReader(new FileReader("second"));
      //  int i=fr.read();
        int i=0;
        while ((i=br.read())!=-1)
        {
            System.out.print((char)i);
        }

    }
}
