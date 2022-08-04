package library;
import javax.swing.*;

import java.sql.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class LibrarianLogin extends JFrame implements ActionListener{
          JLabel l1,l2;
          JTextField t1;
          JPasswordField p1;
          JButton  b1,b2;
          Container c;
          LibrarianLogin()
          {
        	  c=getContentPane();
        	  c.setBackground(Color.GRAY);
        	  setTitle("LIBRARIANLOGINPAGE");
        	  setSize(600,600);
        	  setVisible(true);
        	  setLayout(null);
        	  setBounds(200,50,800,600);
        	  
        	  l1=new JLabel("Email ID");
        	  l1.setBounds(100,100,100,50);
        	  add(l1);
        	  t1=new JTextField();
        	  t1.setBounds(200,100,100,50);
        	  add(t1);
        	  t1.setBackground(Color.white);
        	  t1.setToolTipText("Enter Email");
        	  
        	  l2=new JLabel("Password");
        	  l2.setBounds(100,200,100,50);
        	  add(l2);
        	  p1=new JPasswordField();
        	  p1.setBounds(200,200,100,50);
        	  add(p1);
        	  p1.setToolTipText("Enter Password");
        	  p1.setBackground(Color.white);
        	  
        	  b1=new JButton("Submit");
        	  b1.setBounds(100,300,200,50);
        	  add(b1);
        	  b1.addActionListener(this);
        	  b1.setBackground(Color.CYAN);
        		b1.setForeground(Color.black);
        	    b1.setFont(new Font("bold",Font.BOLD,20));
        	   
        	  
        	  b2=new JButton("Cancel");
        	  b2.setBounds(350,300,200,50);
        	  add(b2);
        	  b2.addActionListener(this);
        	  b2.setBackground(Color.orange);
        		b2.setForeground(Color.black);
        	    b2.setFont(new Font("bold",Font.BOLD,20));
        	   
          }
          public static void main(String arg[])
          {
        	  new LibrarianLogin(); 
          }
          
          public void actionPerformed(ActionEvent e)
          {
        	  if(e.getSource()==b1)
        	  {
        	  String email=t1.getText();
        	  String password=p1.getText();
        	  
        	  try
        	  {
        		  Class.forName("oracle.jdbc.driver.OracleDriver");  
        		  Connection con=DriverManager.getConnection(  
        				  "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
        				  Statement st=con.createStatement();
        					  ResultSet rs=st.executeQuery("select * from liblogin where email='"+email+"'and password='"+password+"'");
        				  boolean b=rs.next();
        				  if(b)
        				  {
        					  System.out.println("ok"+b);
        					  new LibrarianHome();
        					  dispose();
        				  }
        				  else
        				  {
        					  dispose();
        					  JOptionPane.showMessageDialog(this,"Wrong Email  and Password");
        				  }
        				  
        				  con.close();
        				 
        	  }
        	  
        	  
        	  catch(Exception e1)
        	  {
        		  System.out.println(e1);
        	  }
        	  
          }
          else
          {
        	  dispose();
        	  new  Home();
          }
          
          
          }}
