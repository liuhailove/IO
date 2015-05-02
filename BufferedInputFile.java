package com.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile
{
	public static String read(String filename) throws IOException
	{
		String s;
		StringBuilder sb=new StringBuilder();
		BufferedReader in=new BufferedReader(new FileReader(filename));
		while((s=in.readLine())!=null)
		{
			sb.append(s+"\n");
		}
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException
	{
		System.out.println(read("D://a.txt"));
	}
}
