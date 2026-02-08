import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation 
{
	
		public static void main(String ar[]) throws IOException
		{
			String s="Hii Hello";
			FileOutputStream fout=new FileOutputStream("D://FirstFile.txt");
			byte b[]=s.getBytes();
			char c[]=s.toCharArray();
			fout.write(b);
			System.out.println(b[0]);
			FileWriter fw= new FileWriter("D://SecondFile.txt");
			fw.write(c);
			fw.flush();
			System.out.println("Done with writing");
			String str= "jay Ho";
			BufferedWriter bfw=new BufferedWriter(fw);
			char d[]=str.toCharArray();
			bfw.write(d);
			bfw.flush();
			FileInputStream fin=new FileInputStream("D://SecondFile.txt");
			int r;
			while((r=fin.read())!=-1)
			{
				System.out.print((char)r);
			}
			
		}
	
}
