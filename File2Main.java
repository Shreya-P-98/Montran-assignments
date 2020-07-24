package com.montran.main;

import java.io.File;
import java.util.Scanner;

import com.montran.util.File2InputStreamUtil;
import com.montran.util.File2OutputStreamUtil;

public class File2Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int EmpId;
		int salary;
		File2OutputStreamUtil File2OutputUtil = new File2OutputStreamUtil();
		File2InputStreamUtil File2InputUtil = new File2InputStreamUtil();
		String filePath;
		String filePath2;
		File file1;
		String temp;
		byte[] fileData;
		
		//code for writing in file...
		System.out.println("Enter Path");
		filePath = scanner.next();
		file1 = new File(filePath);
		System.out.println("Please enter your Name ::");
		name = scanner.next();
		System.out.println("Please enter your Employee ID ::");
		EmpId = scanner.nextInt();
		System.out.println("Please enter your Salary ::");
		salary = scanner.nextInt();
		
		temp = name + EmpId + salary;
		File2OutputUtil.writeDataIntoFile(file1, temp.getBytes());
		System.out.println("Check your file");
		
		
		//code for reading file...
		System.out.println("Enter path of file");
		scanner.nextLine();
		filePath2 = scanner.nextLine();
		file1 = new File(filePath2);

		fileData = File2InputUtil.getFileData(file1);

		System.out.println("Data From File");
		for (byte b : fileData) {
			System.out.print((char) b);
		}
		scanner.close();
		
		
		
	}

}
