import java.util.Scanner;

public class J {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(", ");
		int[] arr = new int[in.length];
		for(int i = 0; i < in.length; i++) {
			arr[i] = Integer.parseInt(in[i]);
		}
		System.out.println(sort(arr));
	}
	public static int[] sort(int[] num) {
		//TYPE CODE HERE
		return num;
	}
}