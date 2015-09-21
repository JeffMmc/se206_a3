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
import java.awt.event.ActionEvent;

public class Login_warning extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_warning frame = new Login_warning();
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
	public Login_warning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWarning = new JLabel("Warning");
		lblWarning.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblWarning.setBounds(72, 25, 86, 31);
		contentPane.add(lblWarning);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(25, 109, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnTryAgain = new JButton("Try again");
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTryAgain.setBounds(124, 109, 89, 23);
		contentPane.add(btnTryAgain);
		
		JLabel lblThisUserIs = new JLabel("This user is not exsit");
		lblThisUserIs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThisUserIs.setBounds(47, 67, 138, 31);
		contentPane.add(lblThisUserIs);
	}

}
