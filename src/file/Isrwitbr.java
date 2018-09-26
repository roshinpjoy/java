package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Isrwitbr {
    public static void main(String[] args) throws IOException {
        InputStreamReader ins=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ins);
        System.out.println("Enter");
        String name=br.readLine();

        System.out.println("Enter Id:");
        int id=Integer.parseInt(br.readLine());//by readline we can only read strings so convert
        System.out.println(name);
        System.out.println(id);
    }
}
