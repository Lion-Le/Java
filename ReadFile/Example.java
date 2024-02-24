import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example{
	public static void main(String argv[]){
		Example example = new Example();
		try{
			System.out.println("readFile:");
			example.readFile();
			System.out.println("\nreadFile2:");
			example.readFile2();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void readFile() throws IOException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		//建立儲存內容的字元陣列
		char[] a = new char[100];
		fr.read(a); // 讀取檔案內容
		for (char c : a)
			System.out.print(c); // 輸出讀取的內容
		fr.close(); // 關閉讀取資源
	}
	
	public void readFile2() throws IOException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		
		//將FileReader連接至BufferedReader
		BufferedReader bufferedReader = new BufferedReader(fr);
		String line;
		//使用while逐行讀取 直到檔案末行
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line); // 輸出每行內容
		}
		
		// 關閉讀取資源
		bufferedReader.close();
		fr.close();
	}
}