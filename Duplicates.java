
public class Duplicates {
	public static void main(String[] args) {
		int [] a=new int[6];
		a[0]=8;
		a[1]=10;
		a[2]=15;
		a[3]=8;
		a[4]=15;
		a[5]=30;
		for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]==a[j]) {
			System.out.println(a[j]);
		}
	}
			}
		}
		
	}
