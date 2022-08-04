package library;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class LibrarianHome extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6;
	Container c;
	LibrarianHome()
	{
		c=getContentPane();
		c.setBackground(Color.GRAY);
		setTitle("LIBRARIAN HOME PAGE");
		setSize(600,600);
		setVisible(true);
		setBounds(200,50,800,600);
		
		setLayout(null);
		
		b1=new JButton("Student Add");
		b1.setBounds(300,10,200,50);
		add(b1);
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b1.setFont(new Font("bold",Font.BOLD,20));
		   

		b2=new JButton("Student Remove");
		b2.setBounds(300,110,200,50);
		add(b2);
		b2.setBackground(Color.CYAN);
		//b2.setBackground(Color.green);
		b2.setForeground(Color.black);
		b2.setFont(new Font("bold",Font.BOLD,20));
		   
		
		b3=new JButton("Book Add");
		b3.setBounds(300,210,200,50);
		add(b3);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		b3.setFont(new Font("bold",Font.BOLD,20));
		   
		
		b4=new JButton("Book Remove");
		b4.setBounds(300,310,200,50);
		add(b4);
		b4.setBackground(Color.CYAN);
		//b4.setBackground(Color.green);
		b4.setForeground(Color.black);
		b4.setFont(new Font("bold",Font.BOLD,20));
		   
		
		b5=new JButton("Record");
		b5.setBounds(300,410,200,50);
		add(b5);
		b5.setBackground(Color.green);
		b5.setForeground(Color.black);
		b5.setFont(new Font("bold",Font.BOLD,20));
		  
		
		b6=new JButton("Logout");
		b6.setBounds(300,510,200,50);
		add(b6);
		b6.setBackground(Color.CYAN);
		//b6.setBackground(Color.green);
		b6.setForeground(Color.black);
		b6.setFont(new Font("bold",Font.BOLD,20));
		   
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}

	public static void main(String arg[])
	{
		new LibrarianHome();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			System.out.println("Student Add");
			dispose();
			new StudentAdd();
		}
		else if(e.getSource()==b2)
		{
			System.out.println("student remove");
			dispose();
			new studentremove();
		}
		else if(e.getSource()==b3)
		{
			System.out.println("Book Add");
			dispose();
			new BookAdd();
		}
		else if(e.getSource()==b4)
		{
			System.out.println("Book Remove");
			dispose();
			new BookRemove();
		}
		else if(e.getSource()==b5)
		{
			System.out.println("Record");
			dispose();
			new Record();
		}
		else
		{
			System.out.println("Logout");
			dispose();
			new Home();
			//dispose();
		}
		
	}
}

