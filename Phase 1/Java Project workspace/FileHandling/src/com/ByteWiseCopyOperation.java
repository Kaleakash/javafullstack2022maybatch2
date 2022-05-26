package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseCopyOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("demo1.txt");
FileOutputStream fos = new FileOutputStream("demo2.txt");
int ch;
while((ch=fis.read()) != -1) {		//-1 is equal to EOF
		fos.write(ch);
	}
	System.out.println("File copied...");
}

}
