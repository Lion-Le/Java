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
			// �Y�ɮפ��s�b�A�h�إ߷s�ɮ�
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Hi Java!"); // �g�J���e		
		fw.flush();	// �N�w�İϤ������e�A�j��g�J�ɮ�
		fw.close(); // �����ɮ׸귽
	}
	
	public void writeFile2() throws IOException{
		File file = new File("test2.txt");
		if(!file.exists()) {
			// �Y�ɮפ��s�b�A�h�إ߷s�ɮ�
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		//�NFileWriter�s����BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi Java!"); 			// �g�J���e
		bw.newLine();					// ����
		bw.write("My name is Lion.");	// �g�J���e
		bw.flush();		// �N�w�İϤ������e�A�j��g�J�ɮ�
		bw.close();		// �����ɮ׸귽
		fw.close();		// �����ɮ׸귽
	}
	
	public void readFile(String fileName) throws IOException{
		File file = new File(fileName);
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