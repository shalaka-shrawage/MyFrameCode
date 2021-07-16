import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Shoot {
	private JFrame frame;
	private JTextField name;
	private JTextField contact;
	private JTextField date;
	private JTextField budget;
	private JTextField discount;
	private JTextField place;
	
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/dataframe";
	String driver = "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String pass = "Hey123@$";


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shoot window = new Shoot();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Shoot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		frame = new JFrame("My Frame Management System");
	frame.getContentPane().setBackground(new Color(102, 204, 255));
	frame.setBounds(100, 100, 600, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.setVisible(true);
	frame.setResizable(false);
	
	JLabel Name = new JLabel("Client's Name");
	Name.setBounds(67, 81, 109, 41);
	frame.getContentPane().add(Name);
	Name.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel Contact = new JLabel("Contact No");
	Contact.setBounds(67, 132, 99, 41);
	frame.getContentPane().add(Contact);
	Contact.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel Date = new JLabel("Date");
	Date.setBounds(67, 183, 109, 41);
	frame.getContentPane().add(Date);
	Date.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel Budget = new JLabel("Budget");
	Budget.setBounds(67, 231, 99, 41);
	frame.getContentPane().add(Budget);
	Budget.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel Discount = new JLabel("Discount");
	Discount.setBounds(67, 282, 99, 31);
	frame.getContentPane().add(Discount);
	Discount.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel Place = new JLabel("Place");
	Place.setBounds(67, 323, 109, 41);
	frame.getContentPane().add(Place);
	Place.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	name = new JTextField();
	name.setBounds(186, 92, 96, 19);
	frame.getContentPane().add(name);
	name.setColumns(10);
	
	contact = new JTextField();
	contact.setBounds(186, 143, 96, 19);
	frame.getContentPane().add(contact);
	contact.setColumns(10);
	
	date = new JTextField();
	date.setBounds(186, 194, 96, 19);
	frame.getContentPane().add(date);
	date.setColumns(10);
	
	budget = new JTextField();
	budget.setBounds(186, 242, 96, 19);
	frame.getContentPane().add(budget);
	budget.setColumns(10);
	
	discount = new JTextField("500");
	discount.setBounds(186, 288, 96, 19);
	frame.getContentPane().add(discount);
	discount.setColumns(10);
	
	place = new JTextField();
	place.setBounds(186, 334, 96, 19);
	frame.getContentPane().add(place);
	place.setColumns(10);
	
	JLabel data = new JLabel("In this You will get only Videos.");
	data.setBounds(317, 305, 246, 48);
	frame.getContentPane().add(data);
	
	JLabel OrignalCost = new JLabel("Orignal Cost For PhotoShoot :");
	OrignalCost.setBounds(307, 84, 352, 34);
	frame.getContentPane().add(OrignalCost);
	OrignalCost.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	
	JLabel Aprox = new JLabel("Aprox 10,000");
	Aprox.setBounds(317, 128, 194, 31);
	frame.getContentPane().add(Aprox);
	Aprox.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	JLabel AfterDiscoun = new JLabel("Cost After  Discount Will be");
	AfterDiscoun.setBounds(307, 190, 215, 27);
	frame.getContentPane().add(AfterDiscoun);
	AfterDiscoun.setFont(new Font("Bodoni MT", Font.PLAIN, 15));

	JLabel valueupdated = new JLabel();
	valueupdated.setBounds(317, 242, 99, 34);
	frame.getContentPane().add(valueupdated);
	valueupdated.setFont(new Font("Bodoni MT", Font.PLAIN, 15));

	JLabel lblNewLabel_10 = new JLabel("Insert Data To Database");
	lblNewLabel_10.setBounds(128, 26, 308, 19);
	frame.getContentPane().add(lblNewLabel_10);
	lblNewLabel_10.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
	
	
	JButton add = new JButton("Add");
	add.setBackground(Color.BLACK);
	add.setForeground(Color.WHITE);
	add.setBounds(186, 396, 85, 21);
	frame.getContentPane().add(add);
	add.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	add.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  
        	String value1=name.getText();
        	String value2=contact.getText();
        	String value3=date.getText();
        	String value4=budget.getText();
        	String value5=discount.getText();
        	String value6=place.getText();
        	
        	System.out.println(value1+value2+value3+value4+value5);
        	try {
        		Class.forName(driver);
        		con = DriverManager.getConnection(url, user, pass);
        		PreparedStatement st=con.prepareStatement("insert into dataframe(Name,Contact,Date,BudgetCost,Discount,Place) values(?,?,?,?,?,?)");
        		st.setString(1,value1);
        		st.setString(2,value2);
        		st.setString(3,value3);
        		st.setString(4,value4);
        		st.setString(5,value5);
        		st.setString(6,value6);
        		st.executeUpdate();
        		JOptionPane.showMessageDialog(frame,"Data is successfully inserted into database.");
        		con.close();
        	}
        	catch(Exception ex){
        		JOptionPane.showMessageDialog(frame,ex);
        		}
            
        		
        }
        });
	
	JButton delete = new JButton("Delete");
	delete.setForeground(Color.WHITE);
	delete.setBackground(Color.BLACK);
	delete.setBounds(307, 396, 85, 21);
	frame.getContentPane().add(delete);
	delete.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	delete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
	
	String value1=contact.getText();

	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, pass);
		PreparedStatement st=con.prepareStatement("DELETE FROM dataframe WHERE Contact = ?");
		st.setString(1,value1);
		st.executeUpdate();
		JOptionPane.showMessageDialog(frame,"Record is deleted successfully.");
		con.close();
		}
		catch(Exception exp3)
		{
		JOptionPane.showMessageDialog(frame,"Error in deleting record.");
		}
        }
        });
	

	JButton Press = new JButton("Press");
	Press.setBounds(351, 221, 85, 21);
	frame.getContentPane().add(Press);
	Press.setForeground(new Color(255, 255, 255));
	Press.setBackground(new Color(0, 0, 0));
	Press.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
	
	Press.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          
        	int bud=Integer.parseInt(budget.getText());
        	int disc=Integer.parseInt(discount.getText());
        	
         
        	if(bud<=40000)
            	JOptionPane.showMessageDialog(frame,"Budget should be > than 10,000.");
            	else {
                String op = (String.valueOf(40000-disc));
                valueupdated.setText(op);
            	}
        	
        	if(bud<20000 || bud>10000) {
       		 String lable="Photo Frame will be given as Gift";
       		 data.setText(lable);
       	}
        }
	});
	
	}

	public void setVisisble(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
