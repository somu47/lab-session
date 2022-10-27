package anudip.org;

class Thread1 extends Thread{
	public void run() {
		System.out.println("start");
	}
}

public class Threaddemo {
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();
		t.setName("vijay");
		System.out.println(t.getName());
	}

}
