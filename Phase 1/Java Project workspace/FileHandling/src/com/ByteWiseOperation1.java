package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseOperation1 {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("demo1.txt",true);
		int ch;
		System.out.println("Enter the data");
		while((ch = dis.read()) != '@') {
			fos.write(ch);
			//System.out.print(ch);
		}
		System.out.println("Data stored in file");
	}

}
