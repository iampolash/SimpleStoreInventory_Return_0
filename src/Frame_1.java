import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;

import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Frame_1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField Password;
	private JTable GetCompAT;
	private JTable GetCompBT;
	private JTable EnterCompBT;
	private JTable EnterCompAT;
	String query = "SELECT * FROM EnterCompA";
	private JTable table_1;
	private JTable RTable;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField;
	int sumE1 =0;
	
	public void FindTableGA(String A) 
	   {
		A="%"+A+"%";
	       try
	       {
	           String sql ="select * from EnterCompA Where Item_Name LIKE ? OR RS_Stock  LIKE ?"  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, A);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           GetCompAT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	public void Employee_Table(String A) 
	   {
		A="%"+A+"%";
	       try
	       {
	           String sql ="select * from Add_Employee Where Name LIKE ? OR Phone_Number ?"  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, A);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           table_1.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	
	public void FindTableGB(String A) 
	   {
		A="%"+A+"%";
	       try
	       {
	           String sql ="select * from EnterCompB Where Item_Name LIKE ? OR RS_Stock  LIKE ?"  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, A);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           GetCompBT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	public void ReportA(String A, String B) 
	   {
	       try
	       {
	           String sql ="SELECT * FROM GetCompB WHERE Issue_Date BETWEEN  ?  AND  ? "  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, B);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           table_3.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	
	public void FindTableEA(String A) 
	   {
		A="%"+A+"%";
	       try
	       {
	           String sql ="select * from EnterCompA Where Item_Name LIKE ? OR Model  LIKE ?"  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, A);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           EnterCompAT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	public void FindTableEB(String A) 
	   {
		A="%"+A+"%";
	       try
	       {
	           String sql ="select * from EnterCompB Where Item_Name LIKE ? OR Model  LIKE ?"  ;
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);

	           ist.setString(1, A);
	           ist.setString(2, A);
	           
	           
	           
	           ResultSet table =  ist.executeQuery();
	           EnterCompBT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	
	
	public void Name_GC()
	   {
	       try
	       {
	           String sql ="SELECT Name FROM Add_Employee WHERE Laboratory = ?";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	       } 
	       catch(Exception e)
	       { 
	    	   
	    	   System.out.println(e);  
	    	   
	       }
	   }
	

	public void ReportTableB()
	   {
	       try
	       {
	           String sql ="select * from GetCompB";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           table_3.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       { 
	    	   
	    	   System.out.println(e);  
	    	   
	       }
	   }
	

	//SELECT * FROM GetCompB WHERE Issue_Date BETWEEN  '01-12-2016'  AND  '02-12-2016' ;

	
	public void ReportTableA()
	   {
	       try
	       {
	           String sql ="select * from GetCompa_1";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           table_2.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       { 
	    	   
	    	   System.out.println(e);  
	    	   
	       }
	   }

	
	public void EnterCompB()
	   {
	       try
	       {
	           String sql ="select * from EnterCompB";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           EnterCompBT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       { 
	    	   
	    	   System.out.println(e);  
	    	   
	       }
	   }
	
	public void EnterCompA()
	   {
	       try
	       {
	           String sql ="select * from EnterCompA";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           EnterCompAT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	
	
	public void GetCompA() 
	   {
	       try
	       {
	           String sql ="select * from EnterCompA";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           GetCompAT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }
	
	
	
	
	public void Add_Employee()
	   {
	       try
	       {
	           String sql ="SELECT Name, Laboratory, Designation, Phone_Number, Email_Address, Other_Information  FROM Add_Employee";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           table_1.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	       }
	   }
	
	
	
	public void GetCompB()
	   {
	       try
	       {
	           String sql ="select * from GetCompB";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           GetCompBT.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	       }
	   }
	
	
	
	
	
	
	public void Return()
	   {
	       try
	       {
	           String sql ="select Serial_No, Item_Name, Model, Value, Quantity, Unit, Place, Laboratory, Name, Issue_Date, Description from GetCompB WHERE Return_Date IS  NULL";
	           PreparedStatement   ist = ConnectionC.Dbconnect().prepareStatement(sql);
	           ResultSet table =  ist.executeQuery();
	           RTable.setModel(DbUtils.resultSetToTableModel(table));  
	       } 
	       catch(Exception e)
	       {  
	    	   System.out.println(e);
	       }
	   }

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_1 frame = new Frame_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 
	public Frame_1() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1310, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel ReportTableA = new JPanel();
		ReportTableA.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		ReportTableA.setBounds(189, 222, 1117, 423);
		ReportTableA.setVisible(false);
		
	
		JPanel ReturnTable = new JPanel();
		ReturnTable.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		ReturnTable.setBounds(187, 382, 1117, 266);
		ReturnTable.setVisible(false);
		
		JPanel Report = new JPanel();
		Report.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Report.setBounds(187, 31, 180, 191);
		Report.setVisible(false);
		
		
		
		
		JPanel ReportA = new JPanel();
		ReportA.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		ReportA.setBounds(366, 31, 935, 191);
		ReportA.setVisible(false);
		
		JPanel ReportB = new JPanel();
		ReportB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		ReportB.setBounds(366, 31, 935, 191);
		ReportB.setVisible(false);
		
		
		JPanel Return = new JPanel();
		Return.setForeground(Color.GRAY);
		Return.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Return.setBounds(187, 31,1117, 351);
		Return.setVisible(false);
		

		
		
		JPanel GetCompB = new JPanel();
		GetCompB.setBounds(366, 31, 935, 351);
		contentPane.add(GetCompB);
		GetCompB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		GetCompB.setLayout(null);
		
		JLabel label_5 = new JLabel("Serial No:");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(41, 35, 61, 29);
		GetCompB.add(label_5);
		
		JLabel label_8 = new JLabel("Model:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(58, 106, 43, 30);
		GetCompB.add(label_8);
		
		JLabel label_9 = new JLabel("Item Name:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(20, 70, 81, 27);
		GetCompB.add(label_9);
		
		JLabel label_10 = new JLabel("Value:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(61, 142, 40, 29);
		GetCompB.add(label_10);
		
		JLabel label_11 = new JLabel("Quantity:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(41, 182, 60, 25);
		GetCompB.add(label_11);
		
		JLabel label_12 = new JLabel("Description:");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(375, 180, 75, 29);
		GetCompB.add(label_12);
		
		JLabel label_13 = new JLabel("Unit:");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(72, 218, 30, 25);
		GetCompB.add(label_13);
		
		JTextArea textArea_21 = new JTextArea();
		textArea_21.setBackground(Color.LIGHT_GRAY);
		textArea_21.setFont(new Font("Arial", Font.PLAIN, 18));
		textArea_21.setBounds(474, 182, 236, 61);
		GetCompB.add(textArea_21);
		
		JLabel label_14 = new JLabel("Laboratory:");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_14.setBounds(375, 35, 75, 29);
		GetCompB.add(label_14);
		
		JLabel label_15 = new JLabel("Name:");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_15.setBounds(405, 75, 49, 29);
		GetCompB.add(label_15);
		
		JLabel label_16 = new JLabel("Issue Date:");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_16.setBounds(375, 131, 85, 29);
		GetCompB.add(label_16);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBackground(Color.LIGHT_GRAY);
		dateChooser_3.setDateFormatString("dd-MM-yyyy");
		dateChooser_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_3.setBounds(470, 124, 236, 36);
		GetCompB.add(dateChooser_3);
		
		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.setBackground(Color.LIGHT_GRAY);
		comboBox_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				Name_GC();
			}
		});
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_4.setBounds(470, 35, 236, 36);
		comboBox_4.addItem("VLSI");
		comboBox_4.addItem("MID");
		comboBox_4.addItem("NED");
		comboBox_4.addItem("GED");
		comboBox_4.addItem("RMD");
		comboBox_4.addItem("Production");
		comboBox_4.addItem("Admin");
		GetCompB.add(comboBox_4);
		
		JComboBox<String> comboBox_5 = new JComboBox<String>();
		comboBox_5.setBackground(Color.LIGHT_GRAY);
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_5.setBounds(470, 79, 236, 36);
		comboBox_5.addItem("A");
		comboBox_5.addItem("B");
		comboBox_5.addItem("C");
		GetCompB.add(comboBox_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Frame_1.class.getResource("/Save_Icon.png")));
		
		btnNewButton_6.setBounds(470, 258,236, 63);
		GetCompB.add(btnNewButton_6);
		
		JLabel lblPlace_2 = new JLabel("Place:");
		lblPlace_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlace_2.setBounds(62, 253, 40, 25);
		GetCompB.add(lblPlace_2);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setDateFormatString("dd-MM-yyyy");
		dateChooser_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_2.setBounds(150, 11, -105, 36);
		GetCompB.add(dateChooser_2);
		
		JTextArea textArea_22 = new JTextArea();
		textArea_22.setBackground(Color.LIGHT_GRAY);
		textArea_22.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				FindTableGB(textArea_22.getText().trim());
				
				
			}
		});
		textArea_22.setFont(new Font("Arial", Font.PLAIN, 18));
		textArea_22.setBounds(58, 294, 236, 29);
		GetCompB.add(textArea_22);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(119, 35, 236, 29);
		GetCompB.add(lblNewLabel_3);
		
		JLabel label_47 = new JLabel("");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_47.setBounds(119, 70, 236, 29);
		GetCompB.add(label_47);
		
		JLabel label_48 = new JLabel("");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_48.setBounds(119, 106, 236, 29);
		GetCompB.add(label_48);
		
		JLabel label_49 = new JLabel("");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_49.setBounds(119, 142, 236, 29);
		GetCompB.add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_50.setBounds(119, 178, 236, 29);
		GetCompB.add(label_50);
		
		JLabel label_51 = new JLabel("");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_51.setBounds(119, 214, 236, 29);
		GetCompB.add(label_51);
		
		JLabel label_52 = new JLabel("");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_52.setBounds(119, 249, 236, 29);
		GetCompB.add(label_52);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Frame_1.class.getResource("/I4.png")));
		lblNewLabel_6.setBounds(0, 0, 935, 351);
		GetCompB.add(lblNewLabel_6);
		GetCompB.setVisible(false);
		

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					boolean A = Model.Insert_GCB(label_47.getText(), label_48.getText(), label_49.getText(),label_50.getText(), label_51.getText(),label_52.getText(), comboBox_4.getSelectedItem().toString(), comboBox_5.getSelectedItem().toString(),((JTextField)dateChooser_3.getDateEditor().getUiComponent()).getText(),textArea_21.getText());
				
				
				if (A==true) 
		JOptionPane.showMessageDialog(null, "Insert Complete");
				
				else
				
					JOptionPane.showMessageDialog(null, "Insert Not Complete");
							
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				query = "SELECT * FROM GetCompB";
				
			}
		});
		
		
		

		

		
		JPanel GetCompA_1 = new JPanel();
		GetCompA_1.setForeground(Color.GRAY);
		GetCompA_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		GetCompA_1.setBounds(366, 31, 935, 351);
		contentPane.add(GetCompA_1);
		GetCompA_1.setLayout(null);
		
		JLabel label = new JLabel("Serial No:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(41, 35, 61, 29);
		GetCompA_1.add(label);
		
		JLabel label_1 = new JLabel("Model:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(58, 106, 43, 30);
		GetCompA_1.add(label_1);
		
		JLabel label_2 = new JLabel("Item Name:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(20, 70, 81, 27);
		GetCompA_1.add(label_2);
		
		JLabel label_3 = new JLabel("Value:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(61, 142, 40, 29);
		GetCompA_1.add(label_3);
		
		JLabel label_4 = new JLabel("Quantity:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(41, 182, 60, 25);
		GetCompA_1.add(label_4);
		
		JLabel label_6 = new JLabel("Description:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(375, 186, 75, 29);
		GetCompA_1.add(label_6);
		
		JLabel label_7 = new JLabel("Unit:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(72, 218, 30, 25);
		GetCompA_1.add(label_7);
		
		JLabel lblLaboratory = new JLabel("Laboratory:");
		lblLaboratory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLaboratory.setBounds(375, 35, 75, 29);
		GetCompA_1.add(lblLaboratory);
		
		JLabel lblIssueDate = new JLabel("Issue Date:");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIssueDate.setBounds(375, 135, 81, 29);
		GetCompA_1.add(lblIssueDate);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBackground(Color.LIGHT_GRAY);
		dateChooser_1.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		dateChooser_1.setDateFormatString("dd-MM-yyyy");
		dateChooser_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_1.setBounds(470, 128, 236, 36);
		GetCompA_1.add(dateChooser_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_2.setBounds(470, 35, 236, 36);
		comboBox_2.addItem("VLSI");
		comboBox_2.addItem("MID");
		comboBox_2.addItem("NED");
		comboBox_2.addItem("GED");
		comboBox_2.addItem("RMD");
		comboBox_2.addItem("Production");
		comboBox_2.addItem("Admin");
		
		GetCompA_1.add(comboBox_2);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setBackground(Color.LIGHT_GRAY);
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_3.setBounds(470, 79, 236, 36);
		comboBox_3.addItem("Liton Debnath");
		comboBox_3.addItem("John");
		GetCompA_1.add(comboBox_3);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Frame_1.class.getResource("/Save_Icon.png")));
		
		btnNewButton_5.setBounds(470, 258,236, 63);
		GetCompA_1.add(btnNewButton_5);
		
		JLabel lblPlace_3 = new JLabel("Place:");
		lblPlace_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlace_3.setBounds(62, 254, 40, 25);
		GetCompA_1.add(lblPlace_3);
		
		JLabel label_41 = new JLabel("Name:");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_41.setBounds(401, 82, 49, 29);
		GetCompA_1.add(label_41);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setBackground(Color.LIGHT_GRAY);
		textArea_15.setFont(new Font("Arial", Font.PLAIN, 18));
		textArea_15.setBounds(470, 182, 236, 61);
		GetCompA_1.add(textArea_15);
		
		JTextArea Find1 = new JTextArea();
		Find1.setBackground(Color.LIGHT_GRAY);
		Find1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				FindTableGA(Find1.getText().trim());
			}
		});
		Find1.setBounds(58, 294, 236, 29);
		GetCompA_1.add(Find1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(119, 35, 236, 29);
		GetCompA_1.add(lblNewLabel_4);
		
		JLabel label_18 = new JLabel("");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_18.setBounds(119, 70, 236, 29);
		GetCompA_1.add(label_18);
		
		JLabel label_26 = new JLabel("");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_26.setBounds(119, 106, 236, 29);
		GetCompA_1.add(label_26);
		
		JLabel label_43 = new JLabel("");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_43.setBounds(119, 142, 236, 29);
		GetCompA_1.add(label_43);
		
		JLabel label_44 = new JLabel("");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_44.setBounds(119, 182, 236, 29);
		GetCompA_1.add(label_44);
		
		JLabel label_45 = new JLabel("");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_45.setBounds(119, 218, 236, 29);
		GetCompA_1.add(label_45);
		
		JLabel label_46 = new JLabel("");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_46.setBounds(119, 254, 236, 29);
		GetCompA_1.add(label_46);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Frame_1.class.getResource("/i11.png")));
		lblNewLabel_7.setBounds(0, 0, 935, 351);
		GetCompA_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Byte_Code\\Desktop\\search.png"));
		lblNewLabel_10.setBounds(41, 282, 275, 58);
		GetCompA_1.add(lblNewLabel_10);
		
		
	
		GetCompA_1.setVisible(false);
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					boolean A = Model.Insert_GCA(lblNewLabel_4.getText(), label_18.getText(), label_26.getText(), label_43.getText(), label_44.getText(),label_45.getText(),label_46.getText(),comboBox_2.getSelectedItem().toString(), comboBox_3.getSelectedItem().toString(),((JTextField)dateChooser_1.getDateEditor().getUiComponent()).getText(),textArea_15.getText());
				
	
				if (A==true) 
JOptionPane.showMessageDialog(null, "Insert Complete");
				
				else
				
					JOptionPane.showMessageDialog(null, "Insert Not Complete");
							
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				GetCompA();	
			}
		});
		
		
	
		
		
	
/////////  Add Employee Form 
		
		JPanel Employee = new JPanel();
		Employee.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Employee.setBounds(187, 31, 1117, 351);
		contentPane.add(Employee);
		
			JLabel EL1 = new JLabel("Name:");
			EL1.setBounds(121, 39, 46, 29);
			EL1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL2 = new JLabel("Laboratory:");
			EL2.setBounds(92, 107, 75, 27);
			EL2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL3 = new JLabel("Designation:");
			EL3.setBounds(88, 145, 79, 30);
			EL3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL4 = new JLabel("Phone Number:");
			EL4.setBounds(65, 186, 102, 29);
			EL4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL5 = new JLabel("Email Address:");
			EL5.setBounds(72, 226, 95, 25);
			EL5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL6 = new JLabel("Password:");
			EL6.setBounds(101, 262, 66, 26);
			EL6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JLabel EL7 = new JLabel("Other Information:");
			EL7.setBounds(491, 39, 123, 29);
			EL7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JTextArea ET = new JTextArea();
			ET.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					Employee_Table(ET.getText().trim());
				}
			});
			ET.setBounds(209, 41, 236, 60);
			ET.setBackground(Color.LIGHT_GRAY);
			ET.setFont(new Font("Arial", Font.PLAIN, 18));
			
			JComboBox<String> comboBox = new JComboBox<String>();
			comboBox.setBounds(209, 112, 236, 30);
			comboBox.setBackground(Color.LIGHT_GRAY);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox.addItem("VLSI");
			comboBox.addItem("MID");
			comboBox.addItem("NED");
			comboBox.addItem("GED");
			comboBox.addItem("RMD");
			comboBox.addItem("Production");
			comboBox.addItem("Admin");
			
			JComboBox<String> comboBox_1 = new JComboBox<String>();
			comboBox_1.setBounds(209, 152, 236, 30);
			comboBox_1.setBackground(Color.LIGHT_GRAY);
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1.addItem("CSO");
			comboBox_1.addItem("PSO");
			comboBox_1.addItem("SSO");
			comboBox_1.addItem("SO");
			comboBox_1.addItem("SSA");
			comboBox_1.addItem("SA1");
			comboBox_1.addItem("SA2");
			
			JTextArea ET1 = new JTextArea();
			ET1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					Employee_Table(ET1.getText().trim());
				}
			});
			ET1.setBounds(209, 190, 236, 29);
			ET1.setBackground(Color.LIGHT_GRAY);
			ET1.setFont(new Font("Arial", Font.PLAIN, 18));
			
			JTextArea ET2 = new JTextArea();
			ET2.setBounds(209, 228, 236, 29);
			ET2.setBackground(Color.LIGHT_GRAY);
			ET2.setFont(new Font("Arial", Font.PLAIN, 18));
			
			JTextArea ET4 = new JTextArea();
			ET4.setBounds(624, 41, 236, 59);
			ET4.setBackground(Color.LIGHT_GRAY);
			ET4.setFont(new Font("Arial", Font.PLAIN, 18));
			
			passwordField = new JPasswordField();
			passwordField.setBounds(209, 263, 236, 29);
			passwordField.setBackground(Color.LIGHT_GRAY);
			
			JButton btnNewButton_7 = new JButton("");
			btnNewButton_7.setIcon(new ImageIcon(Frame_1.class.getResource("/Save_Icon.png")));
			btnNewButton_7.setBounds(624, 111, 236, 63);
			
						btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 36));
						
						JLabel lblNewLabel_9 = new JLabel("");
						lblNewLabel_9.setBounds(4, 4, 1117, 351);
						lblNewLabel_9.setIcon(new ImageIcon(Frame_1.class.getResource("/I2.png")));
						Employee.setLayout(null);
						Employee.add(EL4);
						Employee.add(btnNewButton_7);
						Employee.add(EL5);
						Employee.add(comboBox_1);
						Employee.add(ET2);
						Employee.add(ET1);
						Employee.add(EL3);
						Employee.add(EL7);
						Employee.add(ET4);
						Employee.add(passwordField);
						Employee.add(EL2);
						Employee.add(EL6);
						Employee.add(comboBox);
						Employee.add(EL1);
						Employee.add(ET);
						Employee.add(lblNewLabel_9);
						
						JLabel lblNewLabel_2 = new JLabel("");
						lblNewLabel_2.setBounds(209, 111, 827, 307);
						Employee.add(lblNewLabel_2);
						lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Byte_Code\\Desktop\\Frame_12.jpg"));
						
						Employee.setVisible(false);
						
						
						
						btnNewButton_7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								
								try {
									boolean A = Model.Insert_AE(ET.getText(),comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(), ET1.getText(), ET2.getText(), passwordField.getText(), ET4.getText());
									Add_Employee();
							
								if (A==true) 
		JOptionPane.showMessageDialog(null, "Insert Complete");
								
								else
								
									JOptionPane.showMessageDialog(null, "Insert Not Complete");
											
								} catch (Exception e1) {
									
									e1.printStackTrace();
								}
								query = "SELECT * FROM Add_Employee";
								
								
								
							}
						});
		
	
	
		
		JPanel EnterCompB = new JPanel();
		EnterCompB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		EnterCompB.setBounds(366, 31, 935, 351);
		contentPane.add(EnterCompB);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(551, 176, 236, 63);
		btnNewButton_2.setIcon(new ImageIcon(Frame_1.class.getResource("/Save_Icon.png")));
		
		JTextArea textArea_29 = new JTextArea();
		textArea_29.setBounds(551, 94, 236, 57);
		textArea_29.setBackground(Color.LIGHT_GRAY);
		textArea_29.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JTextArea textArea_28 = new JTextArea();
		textArea_28.setBounds(189, 292, 236, 29);
		textArea_28.setBackground(Color.LIGHT_GRAY);
		textArea_28.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_17 = new JLabel("Place:");
		label_17.setBounds(132, 290, 40, 29);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_23 = new JLabel("Description:");
		label_23.setBounds(459, 90, 75, 29);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_23 = new JTextArea();
		textArea_23.setBounds(189, 90, 236, 29);
		textArea_23.setBackground(Color.LIGHT_GRAY);
		textArea_23.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				FindTableEB(textArea_23.getText().trim());
			}
		});
		textArea_23.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_27 = new JLabel("Item Name:");
		label_27.setBounds(90, 89, 81, 27);
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_24 = new JTextArea();
		textArea_24.setBounds(189, 130, 236, 29);
		textArea_24.setBackground(Color.LIGHT_GRAY);
		textArea_24.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				FindTableEB(textArea_24.getText().trim());
				
			}
		});
		textArea_24.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_28 = new JLabel("Model:");
		label_28.setBounds(128, 125, 43, 30);
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_25 = new JTextArea();
		textArea_25.setBounds(189, 170, 236, 29);
		textArea_25.setBackground(Color.LIGHT_GRAY);
		textArea_25.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_29 = new JLabel("Value:");
		label_29.setBounds(131, 170, 40, 29);
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_130 = new JTextArea();
		textArea_130.setBounds(189, 209, 236, 29);
		textArea_130.setBackground(Color.LIGHT_GRAY);
		textArea_130.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_30 = new JLabel("RS.Stock:");
		label_30.setBounds(109, 209, 62, 29);
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_26 = new JTextArea();
		textArea_26.setBounds(190, 249, 81, 29);
		textArea_26.setBackground(Color.LIGHT_GRAY);
		textArea_26.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_31 = new JLabel("Quantity:");
		label_31.setBounds(109, 244, 60, 25);
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea textArea_27 = new JTextArea();
		textArea_27.setBounds(316, 249, 107, 29);
		textArea_27.setBackground(Color.LIGHT_GRAY);
		textArea_27.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_42 = new JLabel("Unit:");
		label_42.setBounds(276, 249, 30, 25);
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_60 = new JLabel("");
		label_60.setBounds(189, 50, 236, 29);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(0, 0, 932, 348);
		lblNewLabel_11.setIcon(new ImageIcon(Frame_1.class.getResource("/I4.png")));
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon(Frame_1.class.getResource("/Update_Icon.png")));
		btnNewButton_4.setBounds(551, 253, 236, 68);
		EnterCompB.setLayout(null);
		EnterCompB.add(label_60);
		EnterCompB.add(label_27);
		EnterCompB.add(label_28);
		EnterCompB.add(textArea_24);
		EnterCompB.add(textArea_29);
		EnterCompB.add(label_29);
		EnterCompB.add(textArea_25);
		EnterCompB.add(label_30);
		EnterCompB.add(textArea_130);
		EnterCompB.add(label_31);
		EnterCompB.add(label_17);
		EnterCompB.add(textArea_26);
		EnterCompB.add(label_42);
		EnterCompB.add(textArea_28);
		EnterCompB.add(btnNewButton_4);
		EnterCompB.add(btnNewButton_2);
		EnterCompB.add(textArea_27);
		EnterCompB.add(textArea_23);
		EnterCompB.add(label_23);
		EnterCompB.add(lblNewLabel_11);
		EnterCompB.setVisible(false);
		
		
			
				
			
			
			
			
			
			
			
Model.Insert_ECB(textArea_23.getText(), textArea_24.getText(), textArea_25.getText(), textArea_130.getText(), textArea_26.getText(), textArea_27.getText(), textArea_28.getText(), textArea_29.getText());


btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {

		int x=1;
		try {

			java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement("select * from EnterCompB WHERE Item_Name = ? AND Model = ? AND Value = ?");
			
			ps.setString(1,textArea_23.getText());
			ps.setString(2,textArea_24.getText());
			ps.setString(3,textArea_25.getText());
							
			
			
			ResultSet r = ps.executeQuery();
			if (r.next())
			{x=0;
			}
			ConnectionC.Dbconnect().close();
			ps.close();
			r.close();
		if (x==1) {
			boolean A;
			try {
				A = Model.Insert_ECB(textArea_23.getText(), textArea_24.getText(), textArea_25.getText(), textArea_130.getText(), textArea_26.getText(), textArea_27.getText(), textArea_28.getText(), textArea_29.getText());
				if (A==true)
					JOptionPane.showMessageDialog(null, "Insert Complete");
					
					else
					
						JOptionPane.showMessageDialog(null, "Insert Not Complete");
			
			} catch (Exception e1) {
				
				System.out.println(e1);
			}
			try {
				SwingUtilities.updateComponentTreeUI(new Frame_1());
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			EnterCompB();
		}
		else
		{JOptionPane.showMessageDialog(null, "Duplicate Value");	
		}				
							} catch (Exception e2) {				
		}	
	
	}
});
		
		
////////End of Employee Form 
		
	
		
////////Enter Component
			
		JPanel EnterCompA = new JPanel();
		EnterCompA.setBounds(366, 31, 935, 351);
		contentPane.add(EnterCompA);
		EnterCompA.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		JLabel label_19 = new JLabel("Model:");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_20 = new JLabel("Item Name:");
		label_20.setBackground(Color.LIGHT_GRAY);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_21 = new JLabel("Value:");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_22 = new JLabel("Quantity:");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPlace = new JLabel("Place:");
		lblPlace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea A_Item_name = new JTextArea();
		A_Item_name.setBackground(Color.LIGHT_GRAY);
		A_Item_name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				FindTableEA(A_Item_name.getText().trim());
				
			}
		});
		A_Item_name.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JTextArea A_Model = new JTextArea();
		A_Model.setBackground(Color.LIGHT_GRAY);
		A_Model.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				FindTableEA(A_Model.getText().trim());
			}
		});
		A_Model.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JTextArea A_Value = new JTextArea();
		A_Value.setBackground(Color.LIGHT_GRAY);
		A_Value.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JTextArea A_Quantity = new JTextArea();
		A_Quantity.setBackground(Color.LIGHT_GRAY);
		A_Quantity.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_24 = new JLabel("Unit:");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea A_Unit = new JTextArea();
		A_Unit.setBackground(Color.LIGHT_GRAY);
		A_Unit.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JTextArea A_Place = new JTextArea();
		A_Place.setBackground(Color.LIGHT_GRAY);
		A_Place.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel label_25 = new JLabel("Description:");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea A_Description = new JTextArea();
		A_Description.setBackground(Color.LIGHT_GRAY);
		A_Description.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Frame_1.class.getResource("/Save_Icon.png")));
		
		
		JTextArea textArea_31 = new JTextArea();
		textArea_31.setBackground(Color.LIGHT_GRAY);
		textArea_31.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblRsstock = new JLabel("RS.Stock:");
		lblRsstock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_8 = new JLabel("");
		
		lblNewLabel_8.setIcon(new ImageIcon(Frame_1.class.getResource("/i11.png")));
		
		JLabel label_64 = new JLabel("");
		
		JLabel label_66 = new JLabel("New label");
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

	
				int X = Integer.parseInt(A_Quantity.getText());
				sumE1 = sumE1 + X;
				
				try {
					boolean A = Model.Update_EnterCompA(Integer.toString(sumE1),label_64.getText());
				
				
				if (A==true) 
		JOptionPane.showMessageDialog(null, "Update Complete");
				
				else
				
					JOptionPane.showMessageDialog(null, "Update Not Complete");
							
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				Return();
			
				
				
			
				
				
				
				
				
				
				
				
				
				
			}
		});
		button_1.setIcon(new ImageIcon(Frame_1.class.getResource("/Update_Icon.png")));
		GroupLayout gl_EnterCompA = new GroupLayout(EnterCompA);
		gl_EnterCompA.setHorizontalGroup(
			gl_EnterCompA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EnterCompA.createSequentialGroup()
					.addGap(90)
					.addGroup(gl_EnterCompA.createParallelGroup(Alignment.LEADING)
						.addComponent(label_20)
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(38)
							.addComponent(label_19))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(41)
							.addComponent(label_21))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(19)
							.addComponent(lblRsstock))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(19)
							.addComponent(label_22))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(41)
							.addComponent(lblPlace, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_EnterCompA.createParallelGroup(Alignment.LEADING)
						.addComponent(A_Item_name, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(A_Value, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_31, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(1)
							.addComponent(A_Quantity, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(label_24)
							.addGap(10)
							.addComponent(A_Unit, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addComponent(A_Place, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(label_25)
					.addGap(17)
					.addGroup(gl_EnterCompA.createParallelGroup(Alignment.LEADING)
						.addComponent(A_Description, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_EnterCompA.createSequentialGroup()
					.addGap(189)
					.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_EnterCompA.createSequentialGroup()
					.addGap(189)
					.addComponent(A_Model, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 935, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_EnterCompA.createSequentialGroup()
					.addGap(10)
					.addComponent(label_66))
		);
		gl_EnterCompA.setVerticalGroup(
			gl_EnterCompA.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EnterCompA.createSequentialGroup()
					.addGroup(gl_EnterCompA.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(90)
							.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(15)
							.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblRsstock, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(lblPlace, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(91)
							.addComponent(A_Item_name, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(51)
							.addComponent(A_Value, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textArea_31, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addGroup(gl_EnterCompA.createParallelGroup(Alignment.LEADING)
								.addComponent(A_Quantity, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(A_Unit, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addComponent(A_Place, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(91)
							.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(95)
							.addComponent(A_Description, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(51)
							.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_EnterCompA.createSequentialGroup()
							.addGap(131)
							.addComponent(A_Model, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(label_66))
		);
		EnterCompA.setLayout(gl_EnterCompA);
		EnterCompA.setVisible(false);
		EnterCompA.setVisible(false);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=1;
				try {

					java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement("select * from EnterCompA WHERE Item_Name = ? AND Model = ? AND Value = ?");
					
					ps.setString(1,A_Item_name.getText());
					ps.setString(2,A_Model.getText());
					ps.setString(3,A_Value.getText());
									
					
					
					ResultSet r = ps.executeQuery();
					if (r.next())
					{x=0;
					}
					ConnectionC.Dbconnect().close();
					ps.close();
					r.close();
				if (x==1) {
					boolean A;
					try {
						A = Model.Insert_ECA( A_Item_name.getText(), A_Model.getText(), A_Value.getText(),textArea_31.getText(), A_Quantity.getText(), A_Unit.getText(), A_Place.getText(), A_Description.getText());
						if (A==true)
							JOptionPane.showMessageDialog(null, "Insert Complete");
							
							else
							
								JOptionPane.showMessageDialog(null, "Insert Not Complete");
					
					} catch (Exception e1) {
						
						System.out.println(e1);
					}
					try {
						SwingUtilities.updateComponentTreeUI(new Frame_1());
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
					EnterCompA();
				}
				else
				{JOptionPane.showMessageDialog(null, "Duplicate Value");	
				}				
									} catch (Exception e2) {				
				}	
			}
		});
		
		
		
		JPanel EnterCompTableA = new JPanel();
		EnterCompTableA.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		EnterCompTableA.setBounds(187, 382, 1117, 266);
		contentPane.add(EnterCompTableA);
		EnterCompTableA.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0,0, 1107, 266);
		EnterCompTableA.add(scrollPane_2);
		
		EnterCompAT = new JTable();
		
		scrollPane_2.setViewportView(EnterCompAT);
		EnterCompAT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial No", "Item Name", "Model", "Value", "Quantity", "Unit", "Place", "Description"
			}
		));
		EnterCompAT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EnterCompAT.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Byte_Code\\Desktop\\i11.png"));
		lblNewLabel_12.setBounds(0, 0, 1107, 255);
		EnterCompTableA.add(lblNewLabel_12);
		EnterCompTableA.setVisible(false);
		
		
		EnterCompAT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int Eta=EnterCompAT.getSelectedRow();
			
				
				label_64.setText(EnterCompAT.getValueAt(Eta, 0).toString());
				A_Item_name.setText(EnterCompAT.getValueAt(Eta, 1).toString());
				A_Model.setText(EnterCompAT.getValueAt(Eta, 2).toString());
				A_Value.setText(EnterCompAT.getValueAt(Eta, 3).toString());
				textArea_31.setText(EnterCompAT.getValueAt(Eta, 4).toString());
				A_Quantity.setText(EnterCompAT.getValueAt(Eta, 5).toString());
				A_Unit.setText(EnterCompAT.getValueAt(Eta, 6).toString());
				A_Place.setText(EnterCompAT.getValueAt(Eta, 7).toString());	
				A_Description.setText(EnterCompAT.getValueAt(Eta, 8).toString());
				sumE1= Integer.parseInt(EnterCompAT.getValueAt(Eta, 5).toString());
				
			
				
				
			}
		});
		
	
		
		contentPane.add(Return);
		Return.setLayout(null);
		
		JLabel label_32 = new JLabel("Serial No:");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_32.setBounds(125, 35, 61, 29);
		Return.add(label_32);
		
		JLabel label_33 = new JLabel("Item Name:");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_33.setBounds(104, 70, 81, 27);
		Return.add(label_33);
		
		JLabel label_34 = new JLabel("Model:");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_34.setBounds(142, 106, 43, 30);
		Return.add(label_34);
		
		JLabel label_35 = new JLabel("Value:");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_35.setBounds(145, 142, 40, 29);
		Return.add(label_35);
		
		JLabel label_36 = new JLabel("Quantity:");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_36.setBounds(125, 182, 60, 25);
		Return.add(label_36);
		
		JLabel label_37 = new JLabel("Unit:");
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_37.setBounds(309, 182, 30, 25);
		Return.add(label_37);
		
		JLabel lblReturnDate = new JLabel("Return Date:");
		lblReturnDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblReturnDate.setBounds(473, 119, 84, 29);
		Return.add(lblReturnDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBackground(Color.LIGHT_GRAY);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser.setBounds(577, 114, 236, 36);
		Return.add(dateChooser);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.setIcon(new ImageIcon(Frame_1.class.getResource("/history_clock_time_clear_url-512.png")));
		
			btnUpdate.setBounds(577, 235, 236, 63);
			Return.add(btnUpdate);
			
			JLabel lblPlace_1 = new JLabel("Place:");
			lblPlace_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPlace_1.setBounds(146, 222, 40, 25);
			Return.add(lblPlace_1);
			
			JLabel label_53 = new JLabel("");
			label_53.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_53.setBounds(196, 35, 236, 29);
			Return.add(label_53);
			
			JLabel label_54 = new JLabel("");
			label_54.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_54.setBounds(195, 70, 236, 29);
			Return.add(label_54);
			
			JLabel label_55 = new JLabel("");
			label_55.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_55.setBounds(195, 106, 236, 29);
			Return.add(label_55);
			
			JLabel label_56 = new JLabel("");
			label_56.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_56.setBounds(195, 142, 236, 29);
			Return.add(label_56);
			
			JLabel label_57 = new JLabel("");
			label_57.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_57.setBounds(195, 178, 104, 29);
			Return.add(label_57);
			
			JLabel label_58 = new JLabel("");
			label_58.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_58.setBounds(349, 178, 118, 29);
			Return.add(label_58);
			
			JLabel label_59 = new JLabel("");
			label_59.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_59.setBounds(196, 218, 236, 29);
			Return.add(label_59);
			
			JLabel lblIssueDate_1 = new JLabel("Issue Date:");
			lblIssueDate_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblIssueDate_1.setBounds(480, 70, 77, 29);
			Return.add(lblIssueDate_1);
			
			JLabel label_38 = new JLabel("");
			label_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_38.setBounds(577, 70, 236, 29);
			Return.add(label_38);
			
			JLabel lblTakenBy = new JLabel("Taken By:");
			lblTakenBy.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTakenBy.setBounds(118, 262, 68, 25);
			Return.add(lblTakenBy);
			
			JLabel label_61 = new JLabel("");
			label_61.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_61.setBounds(196, 258, 271, 29);
			Return.add(label_61);
			
			JLabel lblFrom = new JLabel("From:");
			lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFrom.setBounds(146, 302, 40, 25);
			Return.add(lblFrom);
			
			JLabel label_63 = new JLabel("");
			label_63.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_63.setBounds(196, 298, 271, 29);
			Return.add(label_63);
			
			JLabel lblDescription = new JLabel("Description:");
			lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDescription.setBounds(480, 35, 77, 29);
			Return.add(lblDescription);
			
			JLabel label_62 = new JLabel("");
			label_62.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_62.setBounds(577, 35, 530, 29);
			Return.add(label_62);
			
			JLabel lblComment = new JLabel("Comment:");
			lblComment.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblComment.setBounds(489, 178, 70, 29);
			Return.add(lblComment);
			
			textField = new JTextField();
			textField.setBackground(Color.LIGHT_GRAY);
			textField.setBounds(577, 175, 236, 36);
			Return.add(textField);
			textField.setColumns(10);
			
			JLabel icon2 = new JLabel("");
			icon2.setIcon(new ImageIcon(Frame_1.class.getResource("/Return.png")));
			icon2.setBounds(-15, 0, 1143, 364);
			Return.add(icon2);
			
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					
					
					try {
						boolean A = Model.Update_Return(((JTextField)dateChooser.getDateEditor().getUiComponent()).getText(),label_53.getText());
					
					
					if (A==true) 
			JOptionPane.showMessageDialog(null, "Received");
					
					else
					
						JOptionPane.showMessageDialog(null, "Not Received");
								
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					Return();
				}
			});
		
		JPanel EmployeeTable = new JPanel();
		EmployeeTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		

		EmployeeTable.setBounds(187, 382, 1117, 266);
		contentPane.add(EmployeeTable);
		EmployeeTable.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		EmployeeTable.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0,0, 1107, 266);
		EmployeeTable.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
				
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Laboratory", "Designation", "Phone Number", "Email Address", "Other Information"
			}
		));
		scrollPane_1.setViewportView(table_1);
		EmployeeTable.setVisible(false);
		
		
		
		contentPane.add(ReportB);
		ReportB.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Frame_1.class.getResource("/Show.png")));
		
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(128, 104, 236, 60);
		ReportB.add(button);
		
		JDateChooser dateChooser_6 = new JDateChooser();
		dateChooser_6.setDateFormatString("dd-MM-yyyy");
		dateChooser_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_6.setBounds(427, 41, 236, 36);
		ReportB.add(dateChooser_6);
		
		JLabel label_39 = new JLabel("To:");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_39.setBounds(389, 41, 62, 29);
		ReportB.add(label_39);
		
		JDateChooser dateChooser_7 = new JDateChooser();
		dateChooser_7.setDateFormatString("dd-MM-yyyy");
		dateChooser_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_7.setBounds(128, 41, 236, 36);
		ReportB.add(dateChooser_7);
		
		JLabel label_40 = new JLabel("From:");
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_40.setBounds(70, 41, 62, 29);
		ReportB.add(label_40);
		
		JLabel label_67 = new JLabel("");
		label_67.setIcon(new ImageIcon(Frame_1.class.getResource("/I4.png")));
		label_67.setBounds(0, 0, 935, 202);
		ReportB.add(label_67);
		contentPane.add(ReportA);
		ReportA.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("From:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(70, 41, 62, 29);
		ReportA.add(lblNewLabel_1);
		
		JDateChooser dateChooser_4 = new JDateChooser();
		dateChooser_4.setDateFormatString("dd-MM-yyyy");
		dateChooser_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_4.setBounds(128, 41, 236, 36);
		ReportA.add(dateChooser_4);
		
		JDateChooser dateChooser_5 = new JDateChooser();
		dateChooser_5.setDateFormatString("dd-MM-yyyy");
		dateChooser_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dateChooser_5.setBounds(427, 41, 236, 36);
		ReportA.add(dateChooser_5);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTo.setBounds(389, 41, 62, 29);
		ReportA.add(lblTo);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon(Frame_1.class.getResource("/Show.png")));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				ReportTableA();
				
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.setBounds(128, 104, 236, 60);
		ReportA.add(btnNewButton_9);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Frame_1.class.getResource("/i11.png")));
		lblNewLabel_14.setBounds(-11, 0, 936, 191);
		ReportA.add(lblNewLabel_14);
		
		
		JPanel GetComponent = new JPanel();
		GetComponent.setBounds(187, 31, 180, 351);
		contentPane.add(GetComponent);
		GetComponent.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		GetComponent.setLayout(null);
		
			JButton btnGetA = new JButton("G.Consumable");
			btnGetA.setIcon(new ImageIcon(Frame_1.class.getResource("/Component_Icon.png")));
			
			btnGetA.setBounds(10, 29, 160, 120);
			GetComponent.add(btnGetA);
			
			JButton btnGetB = new JButton("G.NonConsumable");
			btnGetB.setIcon(new ImageIcon(Frame_1.class.getResource("/ComponentB_Icon.PNG")));
			
			btnGetB.setBounds(10, 180, 160, 120);
			GetComponent.add(btnGetB);
			
			JLabel label_65 = new JLabel("");
			label_65.setIcon(new ImageIcon(Frame_1.class.getResource("/ChooseOption.PNG")));
			label_65.setBounds(0, 0, 180, 351);
			GetComponent.add(label_65);
			GetComponent.setVisible(false);
			
			


		
		JPanel EnterComponent = new JPanel();
		EnterComponent.setBounds(187, 31, 180, 351);
		contentPane.add(EnterComponent);
		EnterComponent.setLayout(null);
		EnterComponent.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		JButton btnEnterA = new JButton("E.Consumable");
		btnEnterA.setIcon(new ImageIcon(Frame_1.class.getResource("/Component_Icon.png")));
		
		btnEnterA.setBounds(10, 29, 160, 120);
		EnterComponent.add(btnEnterA);
		
		JButton btnEnterB = new JButton("E.NonConsumable");
		btnEnterB.setIcon(new ImageIcon(Frame_1.class.getResource("/ComponentB_Icon.PNG")));
		
		btnEnterB.setBounds(10, 180, 160, 120);
		EnterComponent.add(btnEnterB);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Frame_1.class.getResource("/ChooseOption.PNG")));
		lblNewLabel_15.setBounds(0, 0, 180, 370);
		EnterComponent.add(lblNewLabel_15);
		EnterComponent.setVisible(false);
		
		
		contentPane.add(Report);
		Report.setLayout(null);
		
		JButton btnRconsumable = new JButton("R.Consumable");
		btnRconsumable.setIcon(new ImageIcon(Frame_1.class.getResource("/Component_Icon.png")));
		
		btnRconsumable.setBounds(10, 11, 160, 69);
		Report.add(btnRconsumable);
		
		JButton btnRnonconsumable = new JButton("R.NonConsumable");
		btnRnonconsumable.setIcon(new ImageIcon(Frame_1.class.getResource("/ComponentB1_Icon.png")));
		
		btnRnonconsumable.setBounds(10, 99, 160, 69);
		Report.add(btnRnonconsumable);
		
		JLabel icon1 = new JLabel("");
		icon1.setIcon(new ImageIcon(Frame_1.class.getResource("/ChooseOption.PNG")));
		icon1.setBounds(-20, 0, 213, 204);
		Report.add(icon1);
		
		JPanel Login = new JPanel();
		Login.setBounds(685, 330, 589, 301);
		contentPane.add(Login);
		Login.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		JLabel lblNewLabel = new JLabel("Institute of Electronics");
		lblNewLabel.setBounds(219, 55, 305, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		
		Password = new JPasswordField();
		Password.setBounds(219, 107, 305, 37);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(310, 155, 214, 64);
		
		btnNewButton.setIcon(new ImageIcon(Frame_1.class.getResource("/protect_icon3.jpg")));
		
		JLabel lblNewLabel_5 = new JLabel("Forgot Password ?");
		lblNewLabel_5.setBounds(396, 220, 128, 23);
		
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(0, 0, 617, 321);
		lblNewLabel_13.setIcon(new ImageIcon(Frame_1.class.getResource("/i1.png")));
		Login.setLayout(null);
		Login.add(lblNewLabel);
		Login.add(Password);
		Login.add(btnNewButton);
		Login.add(lblNewLabel_5);
		Login.add(lblNewLabel_13);
		
		contentPane.add(ReturnTable);
		ReturnTable.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0,0, 1107, 266);
		ReturnTable.add(scrollPane_5);
		
		RTable = new JTable();

		
		scrollPane_5.setViewportView(RTable);
		
		JPanel ReportTableB = new JPanel();
		ReportTableB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		ReportTableB.setBounds(188, 222, 1117, 423);
		ReportTableB.setVisible(false);
		contentPane.add(ReportTableB);
		ReportTableB.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 1107, 423);
		ReportTableB.add(scrollPane_7);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item Name", "Model", "Value", "Quantity", "Unit", "Laboratory", "Name", "Issue Date", "Return Date", "Description"
			}
		));
		scrollPane_7.setViewportView(table_3);
		contentPane.add(ReportTableA);
		ReportTableA.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 1107, 423);
		ReportTableA.add(scrollPane_6);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item Name", "Model", "Value", "Quantity", "Unit", "Laboratory", "Name", "Issue Date", "Description"
			}
		));
		scrollPane_6.setViewportView(table_2);
		ReportTableA.setVisible(false);
		
		JPanel EnterCompTableB = new JPanel();
		EnterCompTableB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		EnterCompTableB.setBounds(187, 382, 1117, 266);
		contentPane.add(EnterCompTableB);
		EnterCompTableB.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0,0, 1107, 266);
		EnterCompTableB.add(scrollPane_3);
		
		EnterCompBT = new JTable();
		
		scrollPane_3.setViewportView(EnterCompBT);
		EnterCompBT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial No", "Item Name", "Model", "Value", "Quantity", "Unit", "Place", "Description"
			}
		));
		EnterCompBT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EnterCompBT.setBackground(Color.LIGHT_GRAY);
		EnterCompTableB.setVisible(false);
		
		JPanel GetCompTableB = new JPanel();
		GetCompTableB.setBounds(187, 382, 1117, 266);
		contentPane.add(GetCompTableB);
		GetCompTableB.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		GetCompTableB.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0,0, 1107, 266);
		GetCompTableB.add(scrollPane_4);
		
		GetCompBT = new JTable();
		GetCompBT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int gtb=GetCompBT.getSelectedRow();
				lblNewLabel_3.setText(GetCompBT.getValueAt(gtb, 0).toString());
				label_47.setText(GetCompBT.getValueAt(gtb, 1).toString());
				label_48.setText(GetCompBT.getValueAt(gtb, 2).toString());
				label_49.setText(GetCompBT.getValueAt(gtb, 3).toString());
				label_50.setText(GetCompBT.getValueAt(gtb, 4).toString());
				label_51.setText(GetCompBT.getValueAt(gtb, 5).toString());
				label_52.setText(GetCompBT.getValueAt(gtb, 6).toString());				
			}
		});
		GetCompBT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial No", "Item Name", "Model", "Value", "Quantity", "Unit", "Place", "Description"
			}
		));
		GetCompBT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GetCompBT.setBackground(Color.LIGHT_GRAY);
		scrollPane_4.setViewportView(GetCompBT);
		GetCompTableB.setVisible(false);
		
		
		JPanel GetCompTableA = new JPanel();
		GetCompTableA.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		GetCompTableA.setBounds(187, 382, 1117, 266);
		contentPane.add(GetCompTableA);
		GetCompTableA.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0,0, 1107, 266);
		GetCompTableA.add(scrollPane);
		
		GetCompAT = new JTable();
		
		GetCompAT.setBackground(Color.WHITE);
		GetCompAT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GetCompAT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial No", "Item Name", "Model", "Value", "Quantity", "Unit", "Place", "Description"
			}
		));
		
		
		RTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int rtb=RTable.getSelectedRow();
				label_53.setText(RTable.getValueAt(rtb, 0).toString());
				label_54.setText(RTable.getValueAt(rtb, 1).toString());
				label_55.setText(RTable.getValueAt(rtb, 2).toString());
				label_56.setText(RTable.getValueAt(rtb, 3).toString());
				label_57.setText(RTable.getValueAt(rtb, 4).toString());
				label_58.setText(RTable.getValueAt(rtb, 5).toString());
				label_59.setText(RTable.getValueAt(rtb, 6).toString());
				label_61.setText(RTable.getValueAt(rtb, 8).toString());	
				label_63.setText(RTable.getValueAt(rtb, 7).toString());	
				label_38.setText(RTable.getValueAt(rtb, 9).toString());
				label_62.setText(RTable.getValueAt(rtb, 10).toString());	
				
				
				
			}
		});
		
		EnterCompBT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
	int Etb=EnterCompBT.getSelectedRow();
				
	label_60.setText(EnterCompBT.getValueAt(Etb, 0).toString());
	textArea_23.setText(EnterCompBT.getValueAt(Etb, 1).toString());
	textArea_24.setText(EnterCompBT.getValueAt(Etb, 2).toString());
	textArea_25.setText(EnterCompBT.getValueAt(Etb, 3).toString());
	textArea_130.setText(EnterCompBT.getValueAt(Etb, 4).toString());
	textArea_26.setText(EnterCompBT.getValueAt(Etb, 5).toString());
	textArea_27.setText(EnterCompBT.getValueAt(Etb, 6).toString());
	textArea_28.setText(EnterCompBT.getValueAt(Etb, 7).toString());	
	textArea_29.setText(EnterCompBT.getValueAt(Etb, 8).toString());
	
			}
		});
		
		scrollPane.setViewportView(GetCompAT);
		
		
		GetCompTableA.setVisible(false);
		
		JPanel ChooseOperation = new JPanel();
		ChooseOperation.setBorder(new LineBorder(new Color(128, 128, 128), 0));
		ChooseOperation.setBounds(0, 31, 187, 620);
		contentPane.add(ChooseOperation);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSelectedIcon(new ImageIcon(Frame_1.class.getResource("/print.png")));
		btnNewButton_1.setBounds(10, 29, 158, 78);
		btnNewButton_1.setIcon(new ImageIcon(Frame_1.class.getResource("/shopping-cart-icon.jpg")));
		
		JButton btnEntercomp = new JButton("");
		btnEntercomp.setBounds(10, 135, 158, 78);
		btnEntercomp.setIcon(new ImageIcon(Frame_1.class.getResource("/Enter_Icon.png")));
		
		JButton btnAddemployee = new JButton("");
		btnAddemployee.setBounds(10, 236, 158, 78);
		btnAddemployee.setIcon(new ImageIcon(Frame_1.class.getResource("/Employee.png")));
		
		JButton btnReport = new JButton("");
		btnReport.setBounds(10, 446, 158, 78);
		btnReport.setIcon(new ImageIcon(Frame_1.class.getResource("/ReportIcon.png")));
		
		JButton btnReturn = new JButton("");
		btnReturn.setBounds(10, 343, 158, 78);
		btnReturn.setIcon(new ImageIcon(Frame_1.class.getResource("/return_icon.png")));
		
		JLabel icon3 = new JLabel("Get Product");
		icon3.setBounds(0, 0, 187, 620);
		icon3.setFont(new Font("Angsana New", Font.PLAIN, 43));
		icon3.setIcon(new ImageIcon(Frame_1.class.getResource("/ChooseOption.PNG")));
		icon3.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel lblLkhu = new JLabel("      Get Product");
		lblLkhu.setBounds(10, 102, 158, 25);
		lblLkhu.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		JLabel lblEnterProduct = new JLabel("    Enter Product");
		lblEnterProduct.setBounds(10, 206, 158, 25);
		lblEnterProduct.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		JLabel lblEmployee = new JLabel("        Employee");
		lblEmployee.setBounds(10, 306, 158, 25);
		lblEmployee.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		JLabel lblReturn = new JLabel("         Return");
		lblReturn.setBounds(10, 412, 158, 23);
		lblReturn.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		
		JLabel lblReport = new JLabel("         Report");
		lblReport.setBounds(10, 516, 158, 25);
		lblReport.setFont(new Font("AngsanaUPC", Font.PLAIN, 30));
		ChooseOperation.setLayout(null);
		ChooseOperation.add(lblLkhu);
		ChooseOperation.add(btnNewButton_1);
		ChooseOperation.add(btnAddemployee);
		ChooseOperation.add(lblEmployee);
		ChooseOperation.add(lblReturn);
		ChooseOperation.add(btnReturn);
		ChooseOperation.add(btnReport);
		ChooseOperation.add(lblReport);
		ChooseOperation.add(btnEntercomp);
		ChooseOperation.add(lblEnterProduct);
		ChooseOperation.add(icon3);
		ChooseOperation.setVisible(false);
		
		JLabel Frame_icon = new JLabel("");
		Frame_icon.setIcon(new ImageIcon(Frame_1.class.getResource("/Frame_1.jpg")));
		Frame_icon.setBounds(0, 31, 1334, 617);
		contentPane.add(Frame_icon);
		
		JPanel Top_Panel = new JPanel();
		Top_Panel.setBackground(new Color(0, 0, 128));
		Top_Panel.setBounds(0, 0, 1304, 32);
		contentPane.add(Top_Panel);
		Top_Panel.setLayout(null);
		Top_Panel.setVisible(true);
		
		JLabel clock = new JLabel("");
		clock.setForeground(Color.WHITE);
		clock.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 30));
		clock.setBounds(1092, 0, 202, 32);
		Top_Panel.add(clock);
		
		JLabel calendar = new JLabel("");
		calendar.setForeground(Color.WHITE);
		calendar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 30));
		calendar.setBounds(867, 0, 193, 32);
		Top_Panel.add(calendar);
			
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
      // Btn Get_Comp
			public void actionPerformed(ActionEvent arg0) {
				
				Employee.setVisible(false);
				GetComponent.setVisible(true);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
			
			}		});
	
		
		
		
		btnEntercomp.addActionListener(new ActionListener() {
			//btn EnterComp
			public void actionPerformed(ActionEvent e) {
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(true);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
				
			}	});
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				

				try {
					boolean B = Model.Login_Check(Password.getText());
					if (B == true)
					{
					
						Employee.setVisible(false);
						GetComponent.setVisible(false);
						GetCompA_1.setVisible(false);
						GetCompB.setVisible(false);
						EnterCompA.setVisible(false);
						GetCompTableA.setVisible(false);
						GetCompTableB.setVisible(false);
						EmployeeTable.setVisible(false);
						ReportA.setVisible(false);
						ReportTableA.setVisible(false);
						EnterCompA.setVisible(false);
						EnterCompB.setVisible(false);
						EnterComponent.setVisible(false);
						EnterCompTableA.setVisible(false);
						EnterCompTableB.setVisible(false);
						ChooseOperation.setVisible(true);
						Login.setVisible(false);
						Return.setVisible(false);
						ReturnTable.setVisible(false);
						Report.setVisible(false);
						ReportB.setVisible(false);
						ReportTableA.setVisible(false);
						ReportTableB.setVisible(false);
					}
					
					else
					{JOptionPane.showMessageDialog(null, "Sorry, Try Again");
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
			}
		});
		
		
		
		
		
		
		btnAddemployee.addActionListener(new ActionListener() {
			// btn AddEmployee
			public void actionPerformed(ActionEvent e) {
				Employee.setVisible(true);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(true);
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
			}});
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					}
		});
		
		
	
		btnReport.addActionListener(new ActionListener() {
			// btn Report
			public void actionPerformed(ActionEvent arg0) {
				
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(true);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
				
			}});
		
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {}
		});
	
	
	// Table to form // Get Component A 
		
		GetCompAT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try {
		            int i= GetCompAT.getSelectedRow();
		            
		            
		            TableModel model=GetCompAT.getModel();
		            lblNewLabel_4.setText(model.getValueAt(i,0).toString());
		            label_18.setText(model.getValueAt(i,1).toString());
		            label_26.setText(model.getValueAt(i,2).toString());
		            label_43.setText(model.getValueAt(i,3).toString());
		            label_44.setText(model.getValueAt(i,4).toString());
		            label_45.setText(model.getValueAt(i,5).toString());
		            label_46.setText(model.getValueAt(i,5).toString());
		           
		           
		            
		           
		        } catch (Exception ex) {
		           System.out.println(ex);
		        }
				
			}
		});		
		
		btnEnterA.addActionListener(new ActionListener() {
			// Button Enter CompA Consumable
			public void actionPerformed(ActionEvent arg0) {
				
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				
				Report.setVisible(false);
				
				EnterCompA.setVisible(true);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(true);
				EnterCompTableA.setVisible(true);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
				
				
			}
		});
		
		btnEnterB.addActionListener(new ActionListener() {
			// Button Enter CompB NonConsumable
			public void actionPerformed(ActionEvent e) {
				
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				
				Report.setVisible(false);
				
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(true);
				EnterComponent.setVisible(true);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(true);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
			}
		});
		
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Return();
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				ChooseOperation.setVisible(true);
				Login.setVisible(false);
				Return.setVisible(true);
				ReturnTable.setVisible(true);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
				
			}
		});
		

		btnRconsumable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ReportTableA();
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				ReportA.setVisible(true);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				ChooseOperation.setVisible(true);
				Login.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(true);
				ReportB.setVisible(false);
				ReportTableA.setVisible(true);
				ReportTableB.setVisible(false);
				
			}
		});
		
		btnRnonconsumable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportTableB();
				Employee.setVisible(false);
				GetComponent.setVisible(false);
				GetCompA_1.setVisible(false);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(false);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableB.setVisible(false);
				ChooseOperation.setVisible(true);
				Login.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				EnterCompTableA.setVisible(false);
				Report.setVisible(true);
				ReportB.setVisible(true);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(true);
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ReportA(((JTextField)dateChooser_7.getDateEditor().getUiComponent()).getText(), ((JTextField)dateChooser_6.getDateEditor().getUiComponent()).getText()) ;
			}
		});
		
		btnGetA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetCompA();
				Employee.setVisible(false);
				GetComponent.setVisible(true);
				GetCompA_1.setVisible(true);
				GetCompB.setVisible(false);
				EnterCompA.setVisible(false);
				GetCompTableA.setVisible(true);
				GetCompTableB.setVisible(false);
				EmployeeTable.setVisible(false);
				
				ReportA.setVisible(false);
				ReportTableA.setVisible(false);
				EnterCompA.setVisible(false);
				EnterCompB.setVisible(false);
				EnterComponent.setVisible(false);
				EnterCompTableA.setVisible(false);
				EnterCompTableB.setVisible(false);
				Return.setVisible(false);
				ReturnTable.setVisible(false);
				Report.setVisible(false);
				ReportB.setVisible(false);
				ReportTableA.setVisible(false);
				ReportTableB.setVisible(false);
			}
		});
		
			
			
			btnGetB.addActionListener(new ActionListener() {
				// Get Comp B Panel
				public void actionPerformed(ActionEvent e) {
					GetCompB(); 
					Employee.setVisible(false);
					GetComponent.setVisible(true);
					GetCompA_1.setVisible(false);
					GetCompB.setVisible(true);
					EnterCompA.setVisible(false);
					GetCompTableA.setVisible(false);
					GetCompTableB.setVisible(true);
					EmployeeTable.setVisible(false);
					
					ReportA.setVisible(false);
					ReportTableA.setVisible(false);
					EnterCompA.setVisible(false);
					EnterCompB.setVisible(false);
					EnterComponent.setVisible(false);
					EnterCompTableA.setVisible(false);
					EnterCompTableB.setVisible(false);
					Return.setVisible(false);
					ReturnTable.setVisible(false);
					Report.setVisible(false);
					ReportB.setVisible(false);
					ReportTableA.setVisible(false);
					ReportTableB.setVisible(false);
					
				}
			});
	
			
		
        new Thread()
       {
           public void run()
           {
               while(true)
               {
                   Calendar cal = new GregorianCalendar();
                   String mnt,hr,sc;
                   int hour=cal.get(Calendar.HOUR);
                   int min=cal.get(Calendar.MINUTE);
                   int sec=cal.get(Calendar.SECOND);
                   int dn=cal.get(Calendar.AM_PM);
                   
                   mnt=Integer.toString(min);
                   hr=Integer.toString(hour);
                   sc=Integer.toString(sec);
                   if(min<10)
                       mnt ="0"+min;
                   if(hour<10)
                       hr="0"+hour;
                   if(sec<10)
                       sc="0"+sec;
                   
                   if(dn==1)
                       clock.setText(hr+":"+mnt+":"+sc+" PM");
                   else
                       clock.setText(hr+":"+mnt+":"+sc+" AM");
                   int date=cal.get(Calendar.DATE);
                   int month=cal.get(Calendar.MONTH);
                   int year=cal.get(Calendar.YEAR);
                   calendar.setText(date+"/"+month+"/"+year);
                   
                      
               }
           }
       }.start();
		
		

		GetCompB();
		Return();
		Add_Employee();
		EnterCompB();
		GetCompA();
		EnterCompA();
		ReportTableA();
		ReportTableB();
		Name_GC();
		}
}
