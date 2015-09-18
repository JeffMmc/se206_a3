package se206_a3;

import java.io.File;

import javax.swing.JFileChooser;

import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class MainClass {
	private static JFileChooser fileSelector = new JFileChooser();
	
	public static void main(String[] args) {
		String vlcPath = "", mediapath="";
		File ourFile;
		fileSelector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileSelector.showSaveDialog(null);
		ourFile = fileSelector.getSelectedFile();
		vlcPath = ourFile.getAbsolutePath();
		
		System.out.println(vlcPath);
		
		fileSelector.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileSelector.showSaveDialog(null);
		ourFile = fileSelector.getSelectedFile();
		mediapath = ourFile.getAbsolutePath();
		System.out.println(mediapath);

	}

}
