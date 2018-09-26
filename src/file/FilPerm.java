package file;

import java.io.File;

public class FilPerm {
    public static void main(String[] args) {

        File f=new File("f4");

        boolean exist=f.exists();
        if (exist=true)
        {
            System.out.println("can read"+f.canRead());
            System.out.println("can write"+f.canWrite());
            System.out.println("can execute"+f.canExecute());

            f.setExecutable(true);
            f.setReadable(true);
            f.setWritable(true);

            System.out.println("can read"+f.canRead());
            System.out.println("can write"+f.canWrite());
            System.out.println("can execute"+f.canExecute());




        }
        else
        {
            System.out.println("not found");
        }

}}
