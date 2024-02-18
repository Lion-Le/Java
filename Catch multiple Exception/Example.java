import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example{
	public static void main(String argv[]){
		Example example = new Example();
		System.out.println("readText1:");
		example.readText1();
		System.out.println("\nreadText2:");
		try{
			example.readText2();
		}catch(IOException e){
			System.out.println("�����귽����");
		}
	}
	
	public void readText1(){
		try{
			String fileName = "./test.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader rd = new BufferedReader(fr);
			System.out.println("���e:" + rd.readLine());
		}catch(FileNotFoundException e){
			System.out.println("�䤣���ɮ�!");
		}catch(IOException e){
			System.out.println("�o�ͨ�LŪ�g���~");
		}
	}
	
	public void readText2() throws IOException{
		FileReader fr = null;
		BufferedReader rd = null;
		try{
			String fileName = "./test.txt";
			File file = new File(fileName);
			fr = new FileReader(file);
			rd = new BufferedReader(fr);
			System.out.println("���e:" + rd.readLine());
		}catch(FileNotFoundException e){
			System.out.println("�䤣���ɮ�!");
		}catch(IOException e){
			System.out.println("�o�ͨ�LŪ�g���~");
		}finally{
			if(rd!=null){
				rd.close();
			}
			
			if(fr!=null){
				fr.close();
			}	
		}
	}
}