import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Page1 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField password;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1 window = new Page1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Page1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("My Frame Management System");
		frame.getContentPane().setBackground(new Color(102, 204, 255));
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel heading = new JLabel("Frame Me Photography System");
		heading.setBounds(118, 61, 360, 50);
		heading.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		frame.getContentPane().add(heading);
		
		JLabel id = new JLabel("ID");
		id.setBounds(125, 205, 108, 36);
		frame.getContentPane().add(id);
		id.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setBounds(307, 214, 128, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel pswd = new JLabel("Password");
		pswd.setBounds(125, 305, 108, 36);
		frame.getContentPane().add(pswd);
		pswd.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		JButton login = new JButton("LOG IN");
		login.setForeground(new Color(255, 255, 255));
		login.setBackground(new Color(0, 0, 0));
		login.setBounds(216, 413, 128, 30);
		frame.getContentPane().add(login);
		login.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		password = new JPasswordField();
		password.setBounds(307, 318, 128, 27);
		frame.getContentPane().add(password);
		
		
    	
		login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
      

            		Page2 P2= new Page2();
            		P2.setVisisble(true);
            		
            }
            });
		
		
	}
}
