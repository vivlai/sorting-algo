package sorting;

public class InsertionSort {
	public static int[] insertionSort(int[] arr) {
		int temp = 0;
		// index starts at 1 because first element
		// is considered sorted
		for (int i = 1; i < arr.length; i++) {
			int k = arr[i];
			// j is set to i - 1 because we want to start comparing
			// elements to the left of the current element
			int j = i - 1;
			// loop will only continue if j >= 0 since
			// j decreases by 1 every iteration
			// when k is less than arr[i], means if current element
			// is less than any of the elements on the left,
			// we swap the positions
			while (j >= 0 && k < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// think of insertion sort as sorting poker cards
		// first card is always considered sorted
		// compare adjacent element to current element
		// if it's smaller, swap their positions
		// else stay the same
		
		int[] arr = {5,3,5,2,7,8,10};
		int[] res = insertionSort(arr);
		for (int i : res) System.out.println(i);
	}

}
