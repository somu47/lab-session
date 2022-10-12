


package anudip.org;
class student1{
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}

public class encap {
	public static void main(String[] args) {
		student1 s=new student1();
		s.setSid(12);
		s.setSname("vijay");
		System.out.println(s.getSid()+" "+ s.getSname());
	}

}