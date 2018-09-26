package jdbccon;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prpaid1 {
    Connection c;
    PreparedStatement p;
    ResultSet rs;
    public  Prpaid1() throws SQLException, ClassNotFoundException {
        c=Dbclass.getConnection();

    }

    public  void insert() throws SQLException {



        do {
            p = c.prepareStatement("insert into student values(?,?)");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id");
            int id =Integer.parseInt(sc.nextLine());
            System.out.println("Enter the name");
            String name = sc.nextLine();

            p.setInt(1, id);
            p.setString(2, name);
            p.executeUpdate();

            System.out.println("if give n we dont want to continue");
            String n = sc.nextLine();
            if (n.startsWith("n")) {
                break;
            }
        }
            while (true) ;


        }


        public  void select() throws SQLException {
            p=c.prepareStatement("select * from student");

        }

    public  void resultset() throws SQLException
    {
        select();
        rs=p.executeQuery();
        while (rs.next())
        {
            System.out.println("id"+rs.getInt(1)+"name"+rs.getString(2));
        }


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new  Prpaid1().insert();
        new  Prpaid1().resultset();
    }








    }







