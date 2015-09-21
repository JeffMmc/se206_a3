package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
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
		
		textField = new JTextField();
		textField.setBounds(63, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name can only contain a-z and A-Z characters");
		lblName_1.setBounds(20, 96, 272, 14);
		contentPane.add(lblName_1);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if user is exist, show warning, do nothing

				//if name is empty, show warning, do nothing
				
				//if success, create file, go back to main menu
			}
		});
		btnConfirm.setBounds(20, 121, 89, 23);
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
		btnBack.setBounds(119, 121, 89, 23);
		contentPane.add(btnBack);
	}
}
