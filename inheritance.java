


package anudip.org;
class person1{
	void pid() {
		System.out.println("123");
	}
	
}
class student extends person1{
	void marks() {
		System.out.println("99");
	}
}
class emp extends person1{
	void salary() {
		System.out.println("50000");
	}
}
public class person {
	public static void main(String[] args) {
		student s=new student();
		s.pid();
		s.marks();
	}
	

}