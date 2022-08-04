package library;
import javax.swing.*;


import java.sql.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class  LibrarianAdd extends JFrame implements ActionListener
{
    
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t4,t5,t6;
	//JPasswordField p1;
	ButtonGroup bg;
	JRadioButton r1,r2;
	JButton b1,b2;
	Container c;
	 

	String lname="",lemail="",lgender="",lphone="",lquali="",lqper="";
	//String sid="",sname="",sgender="",squali="",sstatus="";
	
	
	
	 LibrarianAdd()
	{
		 c=getContentPane();
		 c.setBackground(Color.GRAY);
		setTitle("LIBRARIAN ADDITION");
		setSize(1000,1000);
		setVisible(true);
		setLayout(null);
		setBounds(200,50,800,600);	
		l1=new JLabel("Library Name");
		l1.setBounds(100,10,100,50);
		t1=new JTextField();
		t1.setBounds(200,10,100,50);
		t1.setToolTipText("Enter name");
		 t1.setBackground(Color.white);
		 
		l2=new JLabel("E-Mail");
		l2.setBounds(100,100,100,50);
		t2=new JTextField();
		t2.setBounds(200,100,100,50);
		t2.setToolTipText("Enter email");
		 t2.setBackground(Color.white);
		 
		l3=new JLabel("Gender");
		l3.setBounds(100,200,100,50);
		
		r1=new JRadioButton("Female",false);
		r1.setBounds(200,200,100,50);
		r2=new JRadioButton("Male",false);
		r2.setBounds(300,200,100,50);
		
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		l4=new JLabel("Phone NO.");
		l4.setBounds(100,300,100,50);
		t4=new JTextField();
		t4.setBounds(200,300,100,50);
		t4.setToolTipText("Enter phone no");
		 t4.setBackground(Color.white);

		 l5=new JLabel("Qualification");
		l5.setBounds(100,400,100,50);
		t5=new JTextField();
		t5.setBounds(200,400,100,50);
		t5.setToolTipText("Enter qualification");
		 t5.setBackground(Color.white);
		 
		l6=new JLabel("Qualification(%)");
		l6.setBounds(300,400,100,50);
		t6=new JTextField();
		t6.setBounds(400,400,100,50);
		t6.setToolTipText("Enter pencent");
		 t6.setBackground(Color.white);
		
		b1=new JButton("Submit");
		b1.setBounds(200,500,100,50);
		b1.addActionListener(this);
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.black);
	    b1.setFont(new Font("bold",Font.BOLD,20));
	   
		
		
		b2=new JButton("Cancel");
		b2.setBounds(350,500,100,50);
		b2.addActionListener(this);
		b2.setBackground(Color.red);
		b2.setForeground(Color.black);
	    b2.setFont(new Font("bold",Font.BOLD,20));
	   

	
	
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    add(t1);
	add(t2);
	add(r1);
	add(r2);
	add(t4);
    add(t5);
    add(t6);
    add(b1);
	add(b2);
	}
public static void main(String arg[])
{
	new  LibrarianAdd();
}

public boolean valid()
{
	if(t1.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter ID");
		return false;
	}
	else if(t2.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else if(r1.getLabel().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else if(r2.getLabel().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else if(t4.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else if(t5.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else if(t6.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the value");
		return false;
	}
	else
	{
		return true;
	}
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		boolean b=valid();
		if(b)
		{
	
		lname=t1.getText();
		lemail=t2.getText();
		
		
		if(r1.isSelected()==true)
		   {
			   lgender=r1.getLabel();
		   }
		   
		   if(r2.isSelected()==true)
		   {
			   lgender=r2.getLabel();
		   }
		   lphone=t4.getText();
			lquali=t5.getText();
			lqper=t6.getText();
		try
		{
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  		  Connection con=DriverManager.getConnection(  
  				  "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			   Statement st=con.createStatement();
			   st.executeUpdate("insert into libadd values('"+lname+"','"+lemail+"','"+lgender+"','"+lphone+"','"+lquali+"','"+lqper+"')");

		con.close();
		dispose();
		JOptionPane.showMessageDialog(this,"REGISTRATION SUUCESSFUL");
		
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}}

		else if(e.getSource()==b2)
	{
		
		dispose();
		new AdminHome();	
	}
		else
			
		{
			System.out.println("cancel");
		
}}}