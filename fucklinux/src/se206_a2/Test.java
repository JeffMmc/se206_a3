package se206_a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		ProcessBuilder builder =
				new ProcessBuilder("ls", "-l", "/usr");
				Process process = builder.start();
				InputStream stdout = process.getInputStream();
				InputStream stderr = process.getErrorStream();
				BufferedReader stdoutBuffered =
				new BufferedReader(new InputStreamReader(stdout));
				String line = null;
				while ((line = stdoutBuffered.readLine()) != null ) {
				System.out.println(line);
				}

	}

}
