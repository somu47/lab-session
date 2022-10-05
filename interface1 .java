
3  multiple ihertiance
                                             

package org.srr;

public interface interface1 {
	void red();
	void green();

}

--------------------------------   [cont]


package org.srr;

public class interface2 implements interface1 {

	@Override
	public void red() {
		
		System.out.println("11");
	}

	@Override
	public void green() {
	
		System.out.println("22");
	}
	public static void main(String[] args) {
		interface2 a=new interface2();
		a.red();
		a.green();
	}
	

}