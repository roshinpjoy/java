package jdbccon;

import java.sql.*;

public class Callablestmt {

    CallableStatement c;
   // ResultSet rs;
    Connection con;

    public  Callablestmt() throws SQLException,ClassNotFoundException
    {
        con=Dbclass.getConnection();
        System.out.println("creating statements");
        String sql="{call getEmployee(?,?)}";
        c=con.prepareCall(sql);
        int EMP=101;
        c.setInt(1,EMP);

        c.registerOutParameter(2,Types.VARCHAR);

        System.out.println("executing stored procedure");
        c.execute();
        String FIRST=c.getString(2);

        System.out.println("Emp id"+EMP+"first"+FIRST);



        

    }

    public static void main(String[] args)  throws  ClassNotFoundException,SQLException{
        new Callablestmt();
    }




}
