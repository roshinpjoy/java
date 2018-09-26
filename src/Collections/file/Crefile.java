package Collections.file;
import java.io.*;
import java.util.Scanner;

public class Crefile {

    Crefile() throws IOException{
        BufferedWriter br = new BufferedWriter(new FileWriter("abcd",false));
        for(int i=0;i<2;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Name");
            String name = in.nextLine();
            br.write(name);
            br.write(",");
            System.out.println();
            System.out.println("Enter the Id:");
            String id = in.nextLine();
            br.write(id);
            br.write(",");

            System.out.println("Enter the Marks");
            String mark = in.nextLine();
            br.write(mark);
            //  br.write(",");
            br.newLine();
            br.flush();
            //  br.close();
        }

    }
    public static void main(String[] args) throws IOException {
        Crefile f = new Crefile();



    }
}