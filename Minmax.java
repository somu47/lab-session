public class Minmax {
	public static void main(String[] args) {
		int arr[]= {2,4,8,16,32,1,0};
		int min=arr[0];
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (min>arr[i]) {
				min=arr[i];
			}if (arr[i]>max) {
				max=arr[i];
			}}
		    System.out.println("minimum:"+min);
			System.out.println("maximum:"+max);
		}
	}
