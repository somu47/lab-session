package anudip.org;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EMPDETAILS{
	public static void main(String[] args) throws IOException {
		
		FileOutputStream out=new FileOutputStream("c:emp.txt");
		
		String s="eid , ename , salary";
		
		byte [] b=s.getBytes();
		out.write(b);
		System.out.println("sucess..");
		out.close();
	}
}

