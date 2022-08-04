   package library;
   import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.Font;

import java.awt.Color;
   
   public class FrontPage extends JFrame implements ActionListener
   {
	   ImageIcon img;
	   JButton l1, l2,b1,l3;
	  Container c;
	   
	   String a[];
	   FrontPage()
	   {
		   c=getContentPane();
		   c.setBackground(Color.ORANGE);
		   c.setSize(20000,20000);
		   setVisible(true);
		   setBounds(200,50,800,600);
		   setLayout(null);
		   
		   l1=new JButton("LIBRARY MANAGEMENT SYSTEM");
		   l1.setBounds(150,10,500,100);
		   add(l1);
		   l1.setFont(new Font("bold",Font.BOLD,25));
		   l1.setAlignmentX(CENTER_ALIGNMENT);
		   l1.setBackground(Color.lightGray);
		  	  
	   
	   l2=new JButton("");
	   l2.setIcon(new ImageIcon("D:\\ss.jpg"));
	   l2.setBounds(200,150,400,300);
	   add(l2);
	   l2.addActionListener(this);
		  
		  
	   
	   
	   l3=new JButton("BY ANJALI VISHWAKARMA");
	   l3.setBounds(450,500,300,50);
	   add(l3);
	   l3.setForeground(Color.black);
	   l3.setFont(new Font("bold",Font.BOLD,20));
	   l3.setBackground(Color.lightGray);
	   
	   b1=new JButton("Home");
	   b1.setBounds(650,450,100,50);
	   add(b1);
	   b1.addActionListener(this);
	   b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setFont(new Font("bold",Font.BOLD,15));
		
  }
	   public static void main(String arg[])
	   {
		   new FrontPage();
	   }
	   public void actionPerformed(ActionEvent e)
	   {
		   if(e.getSource()==b1)
		   {
			   dispose();
			   new Home();
		   }
	   }
	  
   }
   
  