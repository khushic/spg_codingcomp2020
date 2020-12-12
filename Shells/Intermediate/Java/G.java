import java.util.Scanner;

public class G {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(", ");
		int[] arr = new int[in.length];
		for(int i = 0; i < in.length; i++) {
			arr[i] = Integer.parseInt(in[i]);
		}
		System.out.println(removeDuplicateElements(arr));
	}
	public static int removeDuplicateElements(int arr[]){
		//TYPE CODE HERE
		return -1;
	}
}