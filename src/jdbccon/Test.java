package jdbccon;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Test {

    Connection con;
    Statement st;
    ResultSet rs;

    public   void  getconnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//register the driver class
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/exp","root","");
        st=con.createStatement();

           }

    public   void  insert() throws ClassNotFoundException, SQLException
    {
        int result= st.executeUpdate("insert into student values (17,'job')");





    }


    public   void  print() throws ClassNotFoundException, SQLException
    {
       rs=st.executeQuery("select * from student");
        while (rs.next())
        {
            System.out.println("id"+rs.getInt(1)+"name :"+rs.getString(2));
        }

    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Test t=new Test();
       t.getconnection();

    t.insert();
    t.print();

       /* Scanner k = new Scanner(System.in);
        System.out.println("enter id");
        int id = k.nextInt();
        System.out.println("enter name");
        String name =  k.next();

        //Inserting data using SQL query
        String sql = "insert into student values('"+id+"','"+name+"')";
*/

















    }
}
