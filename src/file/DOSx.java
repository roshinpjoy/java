package file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DOSx {
    public static void main(String[] args) throws IOException {


        FileOutputStream fout = new FileOutputStream("first");
        DataOutputStream dout=new DataOutputStream(fout);
        dout.write(65);
        System.out.println();
        dout.writeBytes("hai");
        dout.writeChar(65);
        dout.writeDouble(34.34);







    }

}
