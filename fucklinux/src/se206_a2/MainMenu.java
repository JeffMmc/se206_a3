package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	
	private static BufferedReader stdoutBuffered;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblMagicVoiceGame = new JLabel("Magic Voice Game");
		lblMagicVoiceGame.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblMagicVoiceGame.setBounds(35, 11, 214, 51);
		contentPane.add(lblMagicVoiceGame);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame register = new Register();
				register.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnRegister.setBounds(75, 73, 121, 51);
		contentPane.add(btnRegister);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame login = new Login();
				login.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnLogin.setBounds(75, 146, 121, 51);
		contentPane.add(btnLogin);
		
		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				/*if $currentuser not exsit
				 	show warning and do nothing
				*/
				
				try {
					stdoutBuffered = CallBash.callBash("test -z ${CurrentPlayer+x}; echo $?");
					if (!stdoutBuffered.readLine().equals("0")){
						JFrame playGame = new PlayGame();
						playGame.setVisible(true);
						setVisible(false);
						dispose();
					}else{
						JFrame warning = new Warning();
						warning.setMessage("");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
			}
		});
		btnPlayGame.setBounds(75, 221, 121, 51);
		contentPane.add(btnPlayGame);
		
		JButton btnViewStats = new JButton("View Stats");
		btnViewStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if $currentuser not exsit
			 		show warning and do nothing
				*/
				JFrame viewStats = new ViewStats();
				viewStats.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnViewStats.setBounds(75, 291, 121, 51);
		contentPane.add(btnViewStats);
	}
}
