package com.ridgecrest.mail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class FEMail {
	static HashMap<String, String> FEMail = new HashMap<String, String>();
	String mail;
	public void createFile(String fileLoc) {
		try {
			File textFile = new File(fileLoc);
			if (textFile.createNewFile() == true) {
				System.out.println("Sucessful file creation.");
			}
			else {
				System.out.println("File is already existing.");
			}
		}
		catch (IOException e) {
			System.out.println("Unsucessful file creation.");
			e.printStackTrace();
		}
	}
	public void writeFile(String text, String fileLoc) {
		try {
			FileWriter textFile = new FileWriter(fileLoc, false);
			textFile.write(text);
			textFile.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void readFile(HashMap<String, String> hashMap, String fileLoc) {
		try {
			File textFile = new File(fileLoc);
			Scanner scanner = new Scanner(textFile);
			while (scanner.hasNextLine()) {
				mail = scanner.nextLine();
				System.out.println(mail);
				String sender = mail.substring(0, mail.indexOf(";"));
				String message = mail.substring(mail.indexOf("=") + 1, mail.length() - 1);
				FEMail.put("", sender + message);
			}
			scanner.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void composeEmail(String subject, String text, String fileLoc) {
		FEMail.put(subject, text);
		writeFile(FEMail.toString(), fileLoc);
	}
}