import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Page2 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2 window = new Page2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Page2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("My Frame Management System");
		frame.getContentPane().setBackground(new Color(102, 204, 255));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		JLabel heading = new JLabel("Welcome to MY FRAME Management Page");
		heading.setBounds(45,58 , 466, 51);
		heading.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		frame.getContentPane().add(heading);
		
		JLabel select = new JLabel("Select Function ");
		select.setBounds(46, 168, 249, 35);
		frame.getContentPane().add(select);
		select.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		
		JButton birthday = new JButton("BIRTHDAY");
		birthday.setForeground(new Color(255, 255, 255));
		birthday.setBackground(new Color(0, 0, 0));
		birthday.setBounds(45, 232, 200, 35);
		frame.getContentPane().add(birthday);
		birthday.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		
		JButton weeding = new JButton("WEEDING");
		weeding.setBackground(new Color(0, 0, 0));
		weeding.setForeground(new Color(255, 255, 255));
		weeding.setBounds(45, 316,200, 35);
		frame.getContentPane().add(weeding);
		weeding.setFont(new Font("Bodoni MT", Font.PLAIN, 20));
		
		
		JLabel heading_budget = new JLabel("Select Shoot");
		heading_budget.setBounds(332, 160, 244, 50);
		frame.getContentPane().add(heading_budget);
		heading_budget.setFont(new Font("Bodoni MT", Font.BOLD, 25));
		
		JButton photo = new JButton("Photo Shoot");
		photo.setForeground(new Color(255, 255, 255));
		photo.setBackground(new Color(0, 0, 0));
		photo.setBounds(311, 231, 200, 35);
		frame.getContentPane().add(photo);
		photo.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		JButton shoot = new JButton("Video Shoot");
		shoot.setForeground(new Color(255, 255, 255));
		shoot.setBackground(new Color(0, 0, 0));
		shoot.setBounds(311, 315, 200, 35);
		frame.getContentPane().add(shoot);
		shoot.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		JLabel disp = new JLabel("Minimize Frame For Going Back As Frames are OverLapped.");
		disp.setForeground(Color.BLACK);
	
		disp.setBounds(45, 410, 492, 51);
		frame.getContentPane().add(disp);
		disp.setFont(new Font("Bodoni MT", Font.PLAIN, 18));
	
	
	birthday.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  
        		Birthday B= new Birthday();
        		B.setVisisble(true);
        		
        }
        });
	weeding.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Weeding W= new Weeding();
			W.setVisisble(true);
		}
		
	});
	
	photo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  
        		Photo P = new Photo();
        		P.setVisisble(true);
        		
        }
        });
	
	shoot.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Shoot S= new Shoot();
			S.setVisisble(true);
		}
		
	});
	}
	public void setVisisble(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
