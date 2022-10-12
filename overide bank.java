

package anudip.org;
class bank{
	int interest() {
		return 0;
	}
}
class sbi extends bank{
	int interest () {
		return 4;
	}
}
class axis extends bank{
	int interest() {
		return 1;
	}
}

public class bankdetail {
	public static void main(String[] args) {
		sbi s=new sbi();
		axis a=new axis();
		System.out.println("interest:"+s.interest());
		System.out.println("interest:"+a.interest());
	}

}
