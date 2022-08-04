package library;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LibrarianRemove extends JFrame implements ActionListener{
	
	JLabel l1;
	JTextField t1;
	JButton b1,b2;
	String lemail;
	Container c;
	LibrarianRemove()
{
	setSize(500,500);
	setBounds(200,50,800,600);
	setVisible(true);
	setLayout(null);
	c=getContentPane();
	c.setBackground(Color.GRAY);
	

	l1=new JLabel(" E-MAIL");
	l1.setBounds(200,100,100,50);
	t1=new JTextField();
	t1.setBounds(300,100,100,50);	
	add(l1);
	add(t1);
	 t1.setBackground(Color.white);
	b1=new JButton("Submit");
	b1.setBounds(200,200,100,50);
	b1.addActionListener(this);
	b1.setBackground(Color.CYAN);
	b1.setForeground(Color.black);
    b1.setFont(new Font("bold",Font.BOLD,20));
    add(b1);
//    b1.setBackground(Color.white);
   
	
	
	b2=new JButton("Cancel");
	b2.setBounds(350,200,100,50);
	b2.addActionListener(this);
	b2.setBackground(Color.red);
	b2.setForeground(Color.black);
    b2.setFont(new Font("bold",Font.BOLD,20));
   
	add(b2);
}
public static void main(String arg[])
{
	new LibrarianRemove();
}
public void actionPerformed(ActionEvent e)
{
	lemail=t1.getText();
	
	if(e.getSource()==b1)
	try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");  
		  Connection con=DriverManager.getConnection(  
				  "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		   Statement st=con.createStatement();
		   st.executeUpdate("delete from libadd where LEMAIL='"+lemail+"'");
		   con.close();
		   dispose();
		   JOptionPane.showMessageDialog(this,"DELETION SUUCESSFUL");         	   
	   }
	   catch(Exception e2)
	   {
		   System.out.println(e2);
		   dispose();
		
	   }
	else if(e.getSource()==b2)
	{
		 dispose();
		 new AdminHome();
	}
		}
}

