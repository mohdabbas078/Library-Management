package library;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
public class Record extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	Container c;
	Record()
	{
		c=getContentPane();
		c.setBackground(Color.GRAY);
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setTitle("RECORD");
		setBounds(200,50,800,600);

		b1=new JButton("STUDENT RECORD");
		b1.setBounds(200,100,300,50);
		b1.addActionListener(this);
		add(b1);
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.black);
	    b1.setFont(new Font("bold",Font.BOLD,20));
	   
		b2=new JButton("BOOK RECORD");
		b2.setBounds(250,200,200,50);
		 add(b2);
		b2.addActionListener(this);
		b2.setBackground(Color.green);
		b2.setForeground(Color.black);
	    b2.setFont(new Font("bold",Font.BOLD,20));
		b2.addActionListener(this);
		
		b3=new JButton("BACK");
		b3.setBounds(250,300,200,50);
		 add(b3);
		b3.addActionListener(this);
		b3.setBackground(Color.orange);
		b3.setForeground(Color.black);
	    b3.setFont(new Font("bold",Font.BOLD,20));
		b3.addActionListener(this);
		
		
		
	}
	public static void main(String arg[])
	{
		new Record();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
			new studentview();
			
		}
		else if(e.getSource()==b2)
		{
			dispose();
			new bookview();
		}
		else
		{
			dispose();
			new LibrarianHome();
		}
		}
}

