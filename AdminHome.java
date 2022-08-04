package library;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

public class AdminHome extends JFrame implements ActionListener
{
	
	static JButton b1,b2,b3,b4;
	Container c;
	AdminHome()
	{
		c=getContentPane();
		c.setBackground(Color.GRAY);
		c.setBackground(Color.lightGray);
		
		
		
		setTitle("ADMIN HOME PAGE");
		setBounds(200,50,800,600);
		setSize(800,600);
		setVisible(true);
		setLayout(null);
		
		
		
		b1=new JButton("Librarian Add");
		b1.setBounds(200,100,200,50);
		add(b1);
		
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b1.setFont(new Font("bold",Font.BOLD,20));
		   
		

		b2=new JButton("Librarian Remove");
		b2.setBounds(200,200,200,50);
		add(b2);
		b2.setBackground(Color.CYAN);
		//b2.setBackground(Color.orange);
		b2.setForeground(Color.black);
		b2.setFont(new Font("bold",Font.BOLD,20));
		   
		b3=new JButton("Record Check");
		b3.setBounds(200,300,200,50);
		add(b3);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		b3.setFont(new Font("bold",Font.BOLD,20));
		   
		
		b4=new JButton("Logout");
		b4.setBounds(200,400,200,50);
		add(b4);
		b4.setBackground(Color.CYAN);
		//b4.setBackground(Color.orange);
		b4.setForeground(Color.black);
		b4.setFont(new Font("bold",Font.BOLD,20));
		   
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==AdminHome.b1)
		{
			
			System.out.println("Lib add");
			

			
		}
		else if(e.getSource()==AdminHome.b2)
		{
			
			System.out.println("lib remove");
			
			
		}
		else if(e.getSource()==AdminHome.b3)
		{
			System.out.println("Record");
			
			
			
		}
		else 
		{
			System.out.println("logout");
			
			
		}
		
	}
}
class M
{
	public static void main(String arg[])
	{
		new AdminHome();
	}
	
}

