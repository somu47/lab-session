package anudip.org;

import java.io.Console;

public class pwd {
	public static void main(String[] args) {
		 
		Console c=System.console();
		System.out.println("enter pwd");
		char[]ch=c.readPassword();
		String s=String.valueOf(ch);
		System.out.println("pwd is"+s);
	}

}

