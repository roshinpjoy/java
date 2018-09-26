package jdbccon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class imageinsert {
    Connection c;
    PreparedStatement p;
    ResultSet rs;
    public  imageinsert() throws SQLException,ClassNotFoundException
        {

        c=Dbclass.getConnection();
        }

        public  void  insert() throws SQLException, ClassNotFoundException, IOException {
            p = c.prepareStatement("insert into image values(?,?)");
            p.setString(1,"roshin");

            FileInputStream fin=new FileInputStream("E:\\surra.jpg");
            p.setBinaryStream(2,fin,fin.available());

            int i=p.executeUpdate();



        }


}
