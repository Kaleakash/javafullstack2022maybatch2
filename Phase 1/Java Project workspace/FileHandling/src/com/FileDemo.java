package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) throws Exception{
		File ff = new File("C:\\Users\\LENOVO\\Desktop\\Sample.txt");
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getName());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());
		File ff1 = new File("C:\\Users\\LENOVO\\Desktop\\demo.txt");
		ff1.createNewFile();	// it is use to create the empty file 
		//ff1.de
	}

}
