package file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Baisx {
    public static void main(String[] args) {
        byte[] bytes={65,66,67,68};
        ByteArrayInputStream b=new ByteArrayInputStream(bytes);
        int i=0;
        while ((i=b.read())!=-1)
        {
            System.out.print((char)i);
        }

    }
}
