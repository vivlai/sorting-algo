package sorting;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0) return;
		if (low >= high) return;
		
		int i = low, j = high;
		int mid = low + (high-low) / 2;
		int pivot = arr[mid];
		while (i <= j) {
			while (arr[i] < pivot) i++;
			while (arr[j] > pivot) j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (low < j) quickSort(arr, low, j);
		if (high > i) quickSort(arr, i, high);
	}
	public static void main(String[] args) {
		// quick sort uses partition algo that uses two cursors
		// one at the start, and the other at the end
		// cursor moves towards each other
		// if left cursors finds a value smaller than pivot,
		// it ignores and moves ahead
		// else, it stops.
		// similarly, if right cursor finds a value bigger than pivot,
		// it ignores and moves ahead
		// else, it stops.
		// when both cursors stop, items pointed by cursors are swapped,
		// since they are on the wrong side of the array
		// after the sway, cursor continues to move
		
		int[] arr = {5,3,5,2,7,8,10};
		quickSort(arr, 0, arr.length-1);
		for (int i : arr) System.out.println(i);
	}

}
