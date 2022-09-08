
class Operator
{
	public static void main (String[] args)
	{
		int x,y,z,m,n;
		boolean b1;
		char wer;
		x=6;
		y=x;
		z=x+y-1;//assign op
		m=x*z;//arthmatic op
		x+=6;//mult assign op
		n=--z;//unary op
		
		System.out.println(z+" "+m+" "+x+" "+n);
		wer=(x>7 && y>7 && z>7)?'p':'f';//ternary op
		System.out.println(wer);
		System.out.println(x&y);//bitwise op
		System.out.println(x==y);//relation op
		
		b1=(x>7 || y>7);
		System.out.println(b1);
}}	
	