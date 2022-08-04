package library;
import java.awt.Color;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
public class BookAdd extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField  t1,t2,t3,t4,t5;
	JComboBox c1;
	JButton b1,b2;
	Container c;
	String bid="",bname="",bauthor="",bissue="",breturn="",bstatus="";
	BookAdd()
    {
		c=getContentPane();
		c.setBackground(Color.GRAY);
		setBounds(200,50,800,600);
		setTitle("BOOK ADDITION");
		setSize(700,600);
		setVisible(true);
		setLayout(null);
		
		l1=new JLabel("Book ID");
		l1.setBounds(100,10,100,50);
		l2=new JLabel("Name");
		l2.setBounds(100,100,100,50);
		l3=new JLabel("Author Name");
		l3.setBounds(100,200,100,50);
		l4=new JLabel(" Issue Date");
		l4.setBounds(100,300,100,50);
		l5=new JLabel("Expire Date");
		l5.setBounds(400,400,100,50);
		l6=new JLabel("Status");
		l6.setBounds(100,400,100,50);
		
		t1=new  JTextField();
		t1.setBounds(200,10,100,50);
		 t1.setBackground(Color.white);
		//t1.setToolTipText("Enter ID");
		
		t2=new JTextField();
		t2.setBounds(200,100,100,50);
		 t2.setBackground(Color.white);
		//t1.setToolTipText("Enter NAME");
		
		t3=new JTextField();
		t3.setBounds(200,200,100,50);
		//t1.setToolTipText("Enter Author name");
		 t3.setBackground(Color.white);
		
		
		t4=new JTextField();
		t4.setBounds(200,300,100,50);
		//t1.setToolTipText("Enter Date");
		 t4.setBackground(Color.white);
		
		t5=new JTextField();
		t5.setBounds(500,400,100,50);
		String a[]= {"Active"};
		c1=new JComboBox(a);
		c1.setBounds(200,400,100,50);
		 t5.setBackground(Color.white);
		 c1.setBackground(Color.white);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		t1.setToolTipText("Enter ID");
		add(t2);
		t2.setToolTipText("Enter Name");
		add(t3);
		t3.setToolTipText("Enter Author");
		add(t4);
		t4.setToolTipText("Enter Date");
		add(t5);
		add(c1);
		
		b1=new  JButton("ADD");
		b1.setBounds(100,500,150,50);
		add(b1);
		 b1.setBackground(Color.CYAN);
		
		b1.setForeground(Color.black);
	    b1.setFont(new Font("bold",Font.BOLD,20));
	   
		b2=new  JButton("Cancel");
		b2.setBounds(300,500,200,50);
		add(b2);
		b2.setBackground(Color.red);
		b2.setForeground(Color.black);
	    b2.setFont(new Font("bold",Font.BOLD,20));
	   
		b1.addActionListener(this);
		b2.addActionListener(this);
    }	

public static void main(String[] arg)
{
	new BookAdd();
}
public boolean valid()
{
	if(t1.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the ID");
		return false;
	}
	else if(t2.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the Name");
		return false;
	}
	else if(t3.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the Author");
		return false;
	}
	else if(t4.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the Issue date");
		return false;
	}
	else if(t5.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the Return date");
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
		//System.out.println("add");
		
		 bid=t1.getText();
          bname=t2.getText();
		 bauthor=t3.getText();
		 bissue=t4.getText();
		
		 //breturn=t5.getText();
		bstatus=(String)c1.getSelectedItem();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  		  Connection con=DriverManager.getConnection(  
  				  "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			System.out.println("b");
			Statement st=con.createStatement();
			System.out.println("c");
			st.executeUpdate("insert into bookadd values('"+bid+"','"+bname+"','"+bauthor+"','"+bissue+"','"+breturn+"','"+bstatus+"')");
			System.out.println("d");
			
			con.close();
			dispose();
			JOptionPane.showMessageDialog(this,"SuccesFully  Added");
		
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}}
if(e.getSource()==b2)
	{
	System.out.println("if");
		dispose();
		new LibrarianHome();
	}
else
{
	dispose();
	System.out.println("cancel");
	
}
}
}