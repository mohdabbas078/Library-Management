package library;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class Home extends JFrame implements ActionListener
{

	JButton b1,b2,b3;
	Container c;

	
Home()
{
	c=getContentPane();
	c.setBackground(Color.GRAY);
	c.setLayout(null);
	setSize(600,600);
	setVisible(true);
	setLayout(null);
	setBounds(200,50,800,600);
	setTitle("HOME PAGE");
	
	b1=new JButton("Admin");
	b1.setBounds(300,100,200,50);
	add(b1);
	b1.addActionListener(this);
	b1.setBackground(Color.ORANGE);
	b1.setForeground(Color.black);
    b1.setFont(new Font("bold",Font.BOLD,25));
   
	b2=new JButton("Librarian");
	b2.setBounds(300,200,200,50);
	add(b2);
	b2.addActionListener(this);	
	b2.setBackground(Color.CYAN);
	b2.setForeground(Color.black);
	 b2.setFont(new Font("bold",Font.BOLD ,25));
	 
	 b3=new JButton("BACK");
		b3.setBounds(300,300,200,50);
		add(b3);
		b3.addActionListener(this);	
		b3.setBackground(Color.ORANGE);
		b3.setForeground(Color.black);
		 b3.setFont(new Font("bold",Font.BOLD ,20));
}
public static void main(String arg[])
{
	new Home();
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
	dispose();
	//new AdminLogin();
	}
	else if(e.getSource()==b2)
	{
		dispose();
		//new LibrarianLogin();
	}
	else
	{
		dispose();
		//new FrontPage();
	}
}

}