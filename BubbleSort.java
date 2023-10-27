import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the list length: ");
		int n = s.nextInt();
		
		System.out.println("Please enter " + n + " numbers: ");
		
		int[] inputs = new int[n];
		
		for (int i = 0; i < n; i++) {
			inputs[i] = s.nextInt();
		}
		s.close();
		
		System.out.println("Your entered list of numbers: " + "\n" + Arrays.toString(inputs));
		
		System.out.println("\nNumbers sorted using Bubble Sort: ");
		bubblesort(inputs);
		
	}
	
	public static void bubblesort(int[] arr) {
		int n = arr.length;
		
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i; j++) {
			if (arr[j-1] > arr[j]) {
				swap(arr, j-1, j);
			}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arrr, int pos1, int pos2) {
		int temp = arrr[pos1];
		arrr[pos1] = arrr[pos2];
		arrr[pos2] = temp;
	}
	

}
