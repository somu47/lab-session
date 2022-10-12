 


package anudip.org;
abstract class shape{
	abstract void draw();
	
}
class circle extends shape{

	@Override
	void draw() {
		System.out.println("circle draw");
		
	}
	
}
class rectangle extends shape{

	@Override
	void draw() {
		System.out.println("rectangle draw");
		
	}
	
}

public class absrat {
	public static void main(String[] args) {
		shape s=new rectangle();
		s.draw();
	}

}