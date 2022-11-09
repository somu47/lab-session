
package anudip.org;

import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int eid;
		String ename;
		double salary;
		Boolean a;
		System.out.println("enter eid");
		eid=s.nextInt();
		System.out.println("enter name");
		ename=s.next();
		System.out.println("salary");
		salary=s.nextDouble();
		System.out.println("boolean");
		a=s.nextBoolean();
		
		System.out.println(eid+" "+ ename+" "+salary+" "+a);
	}

}

