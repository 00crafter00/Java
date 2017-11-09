package ReadfromFile;

import java.util.Scanner;
import java.io.*;

public class readfromfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader file = new FileReader("C:/test.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		System.out.println(text);
		
		
		
	}

}
