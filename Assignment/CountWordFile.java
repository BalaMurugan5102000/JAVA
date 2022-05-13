package java_activities;

import java.io.BufferedReader;
import java.io.FileReader;


public class CountWordFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line;
		int count = 0;
		
		FileReader file = new FileReader("D:\\data.txt");
		BufferedReader br = new BufferedReader(file);
		
		while((line = br.readLine())!=null) {
			String words[] = line.split(" ");
			count = count + words.length;
		}
		System.out.println("Numbers of words present in the given file :"+ count);
		br.close();
			}
		}
		
