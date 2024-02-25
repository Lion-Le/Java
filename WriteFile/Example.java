import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example{
	public static void main(String argv[]){
		Example example = new Example();
		try{
			example.writeFile();
			System.out.println("write File(FileWriter) done.");
			example.writeFile2();
			System.out.println("write File(BufferedWriter) done.");
			
			System.out.println("\ntest.txt:");
			example.readFile("test.txt");
			System.out.println("\ntest2.txt:");
			example.readFile("test2.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void writeFile() throws IOException{
		File file = new File("test.txt");
		if(!file.exists()) {
			// 若檔案不存在，則建立新檔案
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Hi Java!"); // 寫入內容		
		fw.flush();	// 將緩衝區中的內容，強制寫入檔案
		fw.close(); // 關閉檔案資源
	}
	
	public void writeFile2() throws IOException{
		File file = new File("test2.txt");
		if(!file.exists()) {
			// 若檔案不存在，則建立新檔案
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		//將FileWriter連接至BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi Java!"); 			// 寫入內容
		bw.newLine();					// 換行
		bw.write("My name is Lion.");	// 寫入內容
		bw.flush();		// 將緩衝區中的內容，強制寫入檔案
		bw.close();		// 關閉檔案資源
		fw.close();		// 關閉檔案資源
	}
	
	public void readFile(String fileName) throws IOException{
		File file = new File(fileName);
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