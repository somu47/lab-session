
public class Marks {
	public static void main(String[] args) {
		int [] mark= {45,30,50,65,70};
		int total=0;
		int avg;
		for (int i = 0; i < mark.length; i++) {
			total=total+mark[i];
			if (mark[i]>40) {
				System.out.println("pass");
			}if (mark[i]<40) {
				System.out.println("fail");
			}
		}
		System.out.println("total:"+total);
		avg=total/5;
		System.out.println("avg:"+avg);
		
	}

}
