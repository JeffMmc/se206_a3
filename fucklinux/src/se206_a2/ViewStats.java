package se206_a2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ViewStats extends JFrame {

	private JPanel contentPane;
	private static int fileNum;
	private static Map<String, Integer> usernames;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fileNum = countFile();
					ViewStats frame = new ViewStats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static int countFile() throws IOException{
		BufferedReader stdoutBuffered = CallBash.callBash("ls -l ./.magicgame | grep -v ^l | wc -l");
		
		return Integer.parseInt(stdoutBuffered.readLine());
	}
	
	private static void sortUsers() throws IOException{
		BufferedReader stdoutBuffered = CallBash.callBash("ls -l ./.magicgame");
	}

	/**
	 * Create the frame.
	 */
	public ViewStats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 100+(fileNum*50));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame mainMenu = new MainMenu();
				mainMenu.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnBack.setBounds(245, 11, 90, 25);
		contentPane.add(btnBack);
		
		
		JLabel lblViewStats = new JLabel("View Stats");
		lblViewStats.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblViewStats.setBounds(24, 11, 131, 31);
		contentPane.add(lblViewStats);
		
		for (int i = 0; i < fileNum; i++){
			JButton btnNewButton = new JButton("Cancle");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(245, 65+(i*50), 89, 25);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Stats");
			btnNewButton_1.setBounds(136, 65+(i*50), 89, 25);
			contentPane.add(btnNewButton_1);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(53, 65+(i*50), 73, 25);
			contentPane.add(lblNewLabel);
			
			JLabel label = new JLabel(Integer.toString(i+1));
			label.setBounds(24, 65+(i*50), 25, 25);
			contentPane.add(label);
		}
		
		
	}
}
