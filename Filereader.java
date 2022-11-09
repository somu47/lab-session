package anudip.org;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereader {
	public static void main(String[] args)throws IOException{
		FileReader in=null;
		FileWriter out=null;
		try {
			in= new FileReader("c:emp.txt");
			out= new FileWriter("c:emp1.txt");
			int c;
			while ((c=in.read()) != -1) {
				out.write(c);
				
			}
		} finally {
			if (in!=null) {
				in.close();
			}if (out!=null) {
				out.close();
			}
		}
		
		
	}

}

