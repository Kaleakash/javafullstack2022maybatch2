package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByewiseBufferCopyOperation {

	public static void main(String[] args) throws IOException{
	FileInputStream fis = new FileInputStream("D:\\Desktop\\Java Full Stack may 2022 Batch 2\\Phase 1\\Java Programs\\Test.java");
	BufferedInputStream bis = new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Sample.txt");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	int ch;
	while((ch=bis.read()) != -1) {
		bos.write(ch);
	}
	bos.flush(); // clean the buffer at the last. 
	System.out.println("file copied");
	fis.close();
	fos.close();
	}

}
