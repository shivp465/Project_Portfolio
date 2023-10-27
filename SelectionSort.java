import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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
		
		System.out.println("\nNumbers sorted using Selection Sort: ");
		selection_sort(inputs);
		
		

	}
	
	public static void selection_sort (int[] arr) {
		int i, j;
		int iMin;
		for ( j = 0; j < arr.length; j++) {
			iMin = j;
			
			for (i = j+1; i < arr.length; i++) {
				if (arr[i] < arr[iMin]) {
					iMin = i; 
				}
			}
			
			if (iMin != j) {
				swap(arr[j], arr[iMin]);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
