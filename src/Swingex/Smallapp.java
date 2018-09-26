package Swingex;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Smallapp {

    JButton b,b1;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JFrame j1;

    Connection c;
    PreparedStatement p;
    ResultSet r;
     public Smallapp() throws  SQLException,ClassNotFoundException {

        b = new JButton("ok");
         b1 = new JButton("display");

         l1=new JLabel("Name");
         l2=new JLabel("Age");
         l3=new JLabel("Place");
         l4=new JLabel("Course");

         t1=new  JTextField();
         t2=new  JTextField();
         t3=new  JTextField();
         t4=new  JTextField();

         j1=new JFrame("First");



         l1.setBounds(25,40,95,30);
         l2.setBounds(25,60,95,30);
         l3.setBounds(25,80,95,30);
         l4.setBounds(25,100,95,30);

         t1.setBounds(80,40,95,20);
         t2.setBounds(80,60,95,20);
         t3.setBounds(80,80,95,20);
         t4.setBounds(80,100,95,20);

         b.setBounds(80,150,90,25);
         b1.setBounds(200,150,90,25);

         j1.add(l1);
         j1.add(l2);
         j1.add(l3);
         j1.add(l4);

         j1.add(t1);
         j1.add(t2);
         j1.add(t3);
         j1.add(t4);

         j1.add(b);
         j1.add(b1);


         j1.setSize(200,400);
         j1.setLayout(null);
         j1.setVisible(true);

         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e)  {
            int age=Integer.parseInt(t2.getText());
            String name=t1.getText();
            String place=t3.getText();
            String course=t4.getText();




                 try {
                     c=Dbclass.getConnection();
                     p=c.prepareStatement("insert into form values('0 ','"+name+"','"+age+"','"+place+"','"+course+"')");
                     p.executeUpdate();
                     JOptionPane.showMessageDialog(b,"successfull");



                 } catch (ClassNotFoundException e1) {
                     e1.printStackTrace();
                 } catch (SQLException e1) {
                     e1.printStackTrace();
                 }


             }
         });




         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e)  {






                ViewStudent.main(new String[]{});
                j1.dispose();

                     JOptionPane.showMessageDialog(b,"successfull");




                 }



         });








     }

    public static void main(String[] args) throws ClassNotFoundException,SQLException {

         new Smallapp();

    }













}
