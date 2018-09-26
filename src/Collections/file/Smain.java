package Collections.file;

import java.io.*;
import java.util.ArrayList;

public class Smain {
    public static void Getread() throws IOException {

        String str=null;
        ArrayList<Stud> al=new ArrayList<>();
        File f=new File("abcd");
        BufferedReader br=new BufferedReader(new FileReader(f));

        while ((str=br.readLine())!=null)
        {
         String [] x=str.split(",");
         al.add(new Stud(Integer.parseInt(x[1]),x[0],Integer.parseInt(x[2])));//string to ineger for store in al
        }
        for (Stud st:al)
        {
            System.out.println("id"+st.id+"Name"+st.name+"Marks"+st.marks);


        }






    }



    public static void main(String[] args) throws IOException {
        Getread();
    }
}