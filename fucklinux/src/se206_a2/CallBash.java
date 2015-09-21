package se206_a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CallBash {

	public static void main(String[] args) throws IOException {
		
	}
	
	public static BufferedReader callBash(String cmd) throws IOException{
		ProcessBuilder builder =new ProcessBuilder("/bin/bash", "-c", cmd);
		Process process = builder.start();
		InputStream stdout = process.getInputStream();
		InputStream stderr = process.getErrorStream();
		BufferedReader stdoutBuffered = new BufferedReader(new InputStreamReader(stdout));
		/*String line = null;
		while ((line = stdoutBuffered.readLine()) != null ) {
			System.out.println(line);
		}*/
		return stdoutBuffered;
	}

}
