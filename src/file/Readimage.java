package file;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Readimage {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\palla.jpg");
        BufferedImage bim=null;
        //int i=0;
        bim=ImageIO.read(file);
        ImageIO.write(bim,"jpg",new File("my.jpg"));

    }
}
