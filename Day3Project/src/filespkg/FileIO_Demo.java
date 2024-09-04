package filespkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIO_Demo {
	public void writeToFileByte() {
		String path = "E:\\training\\intuit\\jfs_training_2toSep24\\sample.txt";
		String content = "This is the content to write";
		
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		String path = "E:\\training\\intuit\\jfs_training_2toSep24\\sample.txt";
		char[] array = new char[100];
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			int i;
			int index = 0;
			while((i = fr.read()) != -1) {
				array[index] = (char) i;
				index++;
			}
			
//			fr.read(array);
			System.out.println(array);
			fr.close();
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public void readWriteFile() {
		String path = "E:\\training\\intuit\\jfs_training_2toSep24\\sample1.txt";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
//			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			bw.write(str);
			bw.close();
//			fw.close();
			br.close();
		} catch (IOException e) {
			
		}
	}
}
