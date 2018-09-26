package jdbccon;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by agnel on 6/29/18.
 */
public class prpaid {
    Connection c;
    PreparedStatement ps;
    ResultSet rs;

    prpaid()throws SQLException,ClassNotFoundException{

        c=Dbclass.getConnection();
    }

    public void select() throws SQLException,ClassNotFoundException{
        //  c=DbClass.getConnection();
        ps=c.prepareStatement("select * from student");

    }

    public void insert() throws SQLException,ClassNotFoundException{
        // c=DbClass.getConnection();
        ps=c.prepareStatement("insert into student values(?,?)");
        ps.setInt(1,111);
        ps.setString(2,"Pius");
        ps.executeUpdate();

    }

    public void resultSet()throws SQLException,ClassNotFoundException{
        select();
        rs=ps.executeQuery();

        while(rs.next()){
            System.out.println("Id: " +rs.getInt(1)+ "Name: "+rs.getString(2));
        }
    }

    public void update()throws SQLException,ClassNotFoundException{

        ps = c.prepareStatement("update student set name=? where id=?");
        ps.setString(1,"Assisi");
        ps.setInt(2,7);
        ps.executeUpdate();

    }

    public void delete()throws SQLException,ClassNotFoundException{
        ps = c.prepareStatement("delete from student where id=?");
        ps.setInt(1,111);
        ps.executeUpdate();

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        prpaid p = new prpaid();
        //  p.select();
        p.resultSet();
        System.out.println();
        p.insert();
        p.resultSet();
        System.out.println();
        p.update();
        p.resultSet();
        System.out.println();
        p.delete();
        p.resultSet();

    }
}