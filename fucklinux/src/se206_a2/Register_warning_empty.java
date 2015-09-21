package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Register_warning_empty extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_warning_empty frame = new Register_warning_empty();
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
	public Register_warning_empty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserNameCannot = new JLabel("User name cannot be empty");
		lblUserNameCannot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserNameCannot.setBounds(29, 55, 204, 38);
		contentPane.add(lblUserNameCannot);
		
		JLabel lblWarning = new JLabel("Warning");
		lblWarning.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblWarning.setBounds(70, 11, 102, 44);
		contentPane.add(lblWarning);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(70, 104, 89, 23);
		contentPane.add(btnBack);
	}

}
