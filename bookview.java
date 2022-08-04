package library;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import net.proteanit.sql.DbUtils;


public class bookview extends JFrame 
{
	 JScrollPane  cp;
	 JTable ta;
	 int cec;
	 public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			new bookview();
		}

	 public bookview(){


			ta=new JTable();
			ta.setBounds(400,160,470,280);
			add(ta);
			ta.setEnabled(false);
			ta.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 12));
			DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) ta.getTableHeader().getDefaultRenderer();
			renderer.setHorizontalAlignment(JLabel.LEFT);
			ta.getTableHeader().setBackground(Color.LIGHT_GRAY);
			//ta.getTableHeader().setForeground(Color.WHITE);
			UIDefaults defaults = UIManager.getLookAndFeelDefaults();
			if (defaults.get("Table.alternateRowColor") == null)
			    defaults.put("Table.alternateRowColor", new Color(240, 240, 240));

			cp = new JScrollPane(ta);
			cp.setBounds(400,160,470,280);
			add(cp);

			setContentPane(cp);

			setVisible(true);

			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		System.out.println("ok");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select * from bookadd");

			ta.setModel(DbUtils.resultSetToTableModel(rs));
			cn.close();
			}

			catch(Exception e)
			{
				e.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error"); 
			}
			//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setBounds(400, 100, 700, 500);
	 }

}