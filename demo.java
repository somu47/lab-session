this costructor chaining


class demo{
	demo(){
		this(11);
		System.out.println("cons 1");
	}demo(int x){
		
		System.out.println("cons 2");
	}
}

public class chaining {
	public static void main(String[] args) {
		demo d=new demo();
	}

}
