
2  constructor overloading


class bankcus{
	int acnum;
	String acname;
	double amt;
	bankcus(int a,String b,double c){
		acnum=a;
		acname=b;
		amt=c;
	}void show(){
		System.out.println(acnum+" "+acname+" "+amt);
	}
	
}

public class bank {
	public static void main(String[] args) {
		bankcus b=new bankcus(157, "sbi", 755.0);
		b.show();
	}

}
