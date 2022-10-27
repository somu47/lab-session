

package anudip.org;
 class table{
	 synchronized static void prnttab(int n) {
		 for (int i = 0; i <3; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
		}
	 }
 }
 class table2 extends Thread{
	public void run() {
		table.prnttab(2);
	} 
 }

public class synch {
	public static void main(String [] args) {
		table2 t1=new table2();
		t1.start();
	}
	
	

}

