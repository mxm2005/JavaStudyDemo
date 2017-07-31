package Mxm.Demo;
import java.io.*;
import java.nio.ByteBuffer;

public class TestIO {

	public static void WriteToFile() {
		System.out.println("hello");
		try {
			FileWriter fs=new FileWriter("D:\\testJJ.txt");
			fs.write("hello,hello,美女，大美女");
			fs.flush();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ReadFile() {
		try {
			FileReader fs=new FileReader("D:\\testJJ.txt");
			char[] ch=new char[1024];
			int len= fs.read(ch);
			System.out.println(new String(ch,0,len));
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
