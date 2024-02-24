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
		//�إ��x�s���e���r���}�C
		char[] a = new char[100];
		fr.read(a); // Ū���ɮפ��e
		for (char c : a)
			System.out.print(c); // ��XŪ�������e
		fr.close(); // ����Ū���귽
	}
	
	public void readFile2() throws IOException{
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		
		//�NFileReader�s����BufferedReader
		BufferedReader bufferedReader = new BufferedReader(fr);
		String line;
		//�ϥ�while�v��Ū�� �����ɮץ���
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line); // ��X�C�椺�e
		}
		
		// ����Ū���귽
		bufferedReader.close();
		fr.close();
	}
}