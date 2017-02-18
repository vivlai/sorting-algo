package sorting;

public class MergeSort {
	public static void mergeSort(int[] arr, int start, int end) {
		if (start == end) return;
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		merge(arr, start, mid, end);
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int[] left = new int[mid-start+2];
		for (int i = start; i <= mid; i++) left[i-start] = arr[i]; 
		left[mid-start+1] = Integer.MAX_VALUE;
		
		int[] right = new int[end-mid+1];
		for (int i = mid+1; i <= end; i++) right[i-mid-1] = arr[i];
		right[end-mid] = Integer.MAX_VALUE;
		
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		// merge sort recursively breaks down the 
		// array into one element per array
		// it then merges the small array into 
		// 2,4,8 sized array
		
		int[] arr = {5,3,5,2,7,8,10};
		mergeSort(arr, 0, arr.length-1);
		for (int i : arr) System.out.println(i);
	}

}
