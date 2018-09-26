package filen;

import java.io.*;

public class Filei  {
    public static void main(String[] args)  throws IOException {


        FileOutputStream ou=new FileOutputStream("hai.txt",false);
        String s="hello ";
      //  byte[] b =;
        ou.write(s.getBytes());
        ou.close();

        FileInputStream fin = new FileInputStream("hai.txt");
        int i=0;
        while ((i=fin.read()) != -1) {
           // int ch = fin.read();
            System.out.print((char)i);
        }

        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        String line=br.readLine();
        System.out.println("hai");
        System.out.println(line);//console

        BufferedReader brr=new BufferedReader( new FileReader("hai.txt"));
        System.out.println("hai");
        System.out.println(line);





    }
}
