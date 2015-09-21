package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Warning extends JFrame {

	private JPanel contentPane;
	private String wariningMessage = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warning frame = new Warning();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setMessage(String message){
		wariningMessage = message;
	}
	/**
	 * Create the frame.
	 */
	public Warning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserNameCannot = new JLabel(wariningMessage);
		lblUserNameCannot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserNameCannot.setBounds(29, 55, 204, 38);
		contentPane.add(lblUserNameCannot);
		
		JLabel lblWarning = new JLabel("Warning");
		lblWarning.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblWarning.setBounds(105, 11, 89, 43);
		contentPane.add(lblWarning);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(105, 100, 89, 23);
		contentPane.add(btnBack);
	}
	

}
