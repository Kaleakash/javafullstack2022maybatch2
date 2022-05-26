package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharWiseFileOperation {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("demo1.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("demo3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int ch;
		while((ch=br.read()) != -1) {
			bw.write(ch);
		}
		bw.flush();
		fr.close();
		fw.close();
		System.out.println("done");
	}

}
