


package anudip.org;
class swap1{
	void sample(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+""+b);
	}
	void sample(double x,double y) {
		double z;
		z=x;
		x=y;
		y=z;
		System.out.println(x+""+y);
	}
}

public class swap {
	public static void main(String[] args) {
		swap1 s=new swap1();
		s.sample(1.1, 2.2);
		s.sample(1, 9);
	}

}
