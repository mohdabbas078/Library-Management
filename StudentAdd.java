package library;
import javax.swing.*;
import javax.swing.plaf.basic.ComboPopup;
import java.sql.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class StudentAdd extends JFrame implements ActionListener{
    
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t4,t5,t6,t7;
	ButtonGroup bg;
	JRadioButton r1,r2;
	JButton b1,b2;
	
	JComboBox c1;
	Container c;
	
	String sid="",sname="",sgender="",squali="",sissue="",sreturn="",sfine="",sstatus="";
	
	
	StudentAdd()
	{
		c=getContentPane();
		c.setBackground(Color.GRAY);
		setTitle("STUDENT ADDITION");
		setSize(900,900);
		setVisible(true);
		setLayout(null);
		setBounds(200,50,800,600);
		
		l1=new JLabel("Library ID");
		l1.setBounds(100,10,100,50);
		t1=new JTextField();
		t1.setBounds(200,10,100,50);
		 t1.setBackground(Color.white);
		
		l2=new JLabel("Student Name");
		l2.setBounds(100,100,100,50);
		t2=new JTextField();
		t2.setBounds(200,100,100,50);	
		 t1.setBackground(Color.white);
		 
		l3=new JLabel("Gender");
		l3.setBounds(100,200,100,50);
		
		r1=new JRadioButton("Female",false);
		r1.setBounds(200,200,100,50);
		r2=new JRadioButton("Male",false);
		r2.setBounds(300,200,100,50);
		
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		l4=new JLabel("Qualification");
		l4.setBounds(100,300,100,50);
		t4=new JTextField();
		t4.setBounds(200,300,100,50);	
		 t4.setBackground(Color.white);
		 
		l5=new JLabel("Book issue date");
		l5.setBounds(100,400,100,50);
		t5=new JTextField();
		t5.setBounds(200,400,100,50);
		 t5.setBackground(Color.white);
		 
		l6=new JLabel("Book Return Date");
		l6.setBounds(400,100,100,50);
		t6=new JTextField();
		t6.setBounds(500,100,100,50);
		 t6.setBackground(Color.white);
		 
		l7=new JLabel("Fine(in RS)");
		l7.setBounds(400,200,100,50);
		t7=new JTextField();
		t7.setBounds(500,200,100,50);
		 t7.setBackground(Color.white);
		 
		
		l8=new JLabel("Status");
		l8.setBounds(400,400,100,50);
		
		String status[] = {"Active"};
		c1=new JComboBox(status);
		c1.setBounds(500,400,100,50);
		 c1.setBackground(Color.white);
		 
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
		add(l7);
		add(l8);
		add(t1);
		add(t2);
		add(r1);
		add(r2);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(c1);
		add(b1);
		add(b2);
	}
public static void main(String arg[])
{
	new StudentAdd();
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
		JOptionPane.showMessageDialog(this,"Please Enter  Name");
		return false;
	}
	else if(r1.getLabel().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Select Gender");
		return false;
	}
	else if(r2.getLabel().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Select Gender");
		return false;
	}
	else if(t4.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the qualification");
		return false;
	}
	else if(t5.getText().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Please Enter the issue date");
		return false;
	}
	//else if(t6.getText().equals(""))
	//{
		//JOptionPane.showMessageDialog(this,"Please Enter the value");
		//return false;
	//}
	//else if(t7.getText().equals(""))
	//{
		//JOptionPane.showMessageDialog(this,"Please Enter the fine");
		//return false;
//	}
	else if(c1.getSelectedItem().equals(""))
	{
		JOptionPane.showMessageDialog(this,"Select status");
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
		if(b);
		{
	   sid=t1.getText();
	   sname=t2.getText();
	   
	   if(r1.isSelected()==true)
	   {
		   sgender=r1.getLabel();
	   }
	   
	   if(r2.isSelected()==true)
	   {
		   sgender=r2.getLabel();
	   }
	 squali=t4.getText();
	  sissue=t5.getText();
	   //sreturn=t6.getText();
	    //sfine=t7.getText();
	   sstatus=(String)c1.getSelectedItem();
	   
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");  
 		  Connection con=DriverManager.getConnection(  
 				  "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		   Statement st=con.createStatement();
		   st.executeUpdate("insert into student values('"+sid+"','"+sname+"','"+sgender+"','"+squali+"','"+sissue+"','"+sstatus+"')");
		 
		con.close();
		   
		   dispose();
		   JOptionPane.showMessageDialog(this,"REGISTRATION SUUCESSFUL");
		  
            	   
	   }
	   catch(Exception e2)
	   {
		   System.out.println(e2);
	   }
		}}
	else if(e.getSource()==b2)
	{
		dispose();
		new LibrarianHome();
	}
	else 
	{
		System.out.println("cancel");
	}
}
}
