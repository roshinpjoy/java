package jdbccon;

import java.sql.*;
import java.util.Scanner;

public class Test2 {
    Connection con;
   String sql;
    Statement st;
   ResultSet rs;


   /* public   void  getconnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//register the driver class
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/exp","root","");
        st=con.createStatement();

    }*/

    public  void  getdata() throws SQLException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        String name=sc.nextLine();
        System.out.println("Id");
        int id=sc.nextInt();
        sql = "insert into student values("+id+",'"+name+"')";


    }


    public   void  print() throws ClassNotFoundException, SQLException
    {   con=Dbclass.getConnection();
        st=con.createStatement();
        st.executeUpdate(sql);
        rs=st.executeQuery("select * from student");
        while (rs.next())
        {
            System.out.println("id"+rs.getInt(1)+"name :"+rs.getString(2));
        }

    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Test2 t1=new Test2();


        t1.getdata();
        t1.print();

    }
}
