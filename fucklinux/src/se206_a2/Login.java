package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Login");
		lblRegister.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblRegister.setBounds(20, 11, 105, 35);
		contentPane.add(lblRegister);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter your user name");
		lblPleaseEnterYour.setBounds(20, 79, 204, 14);
		contentPane.add(lblPleaseEnterYour);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblName.setBounds(20, 51, 46, 14);
		contentPane.add(lblName);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if user exist, $currentuser = user, go back to main menu
				
				//else if user not exist, show login warning
			}
		});
		btnConfirm.setBounds(20, 104, 89, 23);
		contentPane.add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame mainMenu = new MainMenu();
				mainMenu.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnBack.setBounds(119, 104, 89, 23);
		contentPane.add(btnBack);
		
		textField = new JTextField();
		textField.setBounds(60, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
