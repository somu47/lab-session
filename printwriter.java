
package anudip.org;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Printwriter {
	public static void main(String[] args) throws IOException {
		FileOutputStream out=new FileOutputStream("c:abc.txt");
		PrintStream p= new PrintStream(out);
		p.print(12);
		p.print("somu");
		p.print(12.00);
		p.close();
		out.close();
	}

}