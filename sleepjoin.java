ckage anudip.org;

class slepjoin extends Thread{
	 public void run() {
		for (int i = 0; i <4; i++) {
		try {
		Thread.sleep(500);	
		} catch (Exception e) {
			
		}
		System.out.println(i);
		}
	}
}

public class sleep {
	public static void main(String[] args) {
		slepjoin s1=new slepjoin();
		slepjoin s2=new slepjoin();
		s1.start();
		try {
			s1.join();
		} catch (Exception e) {
			
		}
		s2.start();
	}

}
