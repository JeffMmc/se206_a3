package se206_a2;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JFrame;

public class MainProgramme {
	
	private static BufferedReader stdoutBuffered;
	
	public static void main(String[] args) throws IOException {
		stdoutBuffered = CallBash.callBash("test -d ./.magicgame; echo $?");
		if (!stdoutBuffered.readLine().equals("0")){
			System.out.println("aaa");
			CallBash.callBash("mkdir ./.magicgame");
		}
		
		JFrame mainMenu = new MainMenu();
		mainMenu.setVisible(true);

	}

}
