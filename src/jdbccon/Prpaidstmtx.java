package jdbccon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prpaidstmtx  {

    Connection c;
    PreparedStatement ps;
    ResultSet rs;

    public  void insert() throws SQLException, ClassNotFoundException
    {
        c=Dbclass.getConnection();

    }



    public  void select() throws SQLException, ClassNotFoundException {
        c=Dbclass.getConnection();
        ps=c.prepareStatement("select * from student");
        }

        public  void resultset() throws SQLException {
            rs=ps.executeQuery();

            while (rs.next())
            {
                System.out.println("id"+rs.getInt(1)+"name :"+rs.getString(2));
            }


        }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Prpaidstmtx p=new Prpaidstmtx();
        p.select();
        p.resultset();

    }






}
