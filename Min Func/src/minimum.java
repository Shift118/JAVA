import java.util.Scanner;

public class minimum {
	public static int min(int arr[],int size) {
		int min = arr[0];
		for (int i = 0; i< size; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int size;
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter the list size: ");
		size = cs.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i<size; i++) {
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i] = cs.nextInt();
		}
		cs.close();
		System.out.println("The Minimum Number in the array is "+min(arr, size)); 
	}
}
