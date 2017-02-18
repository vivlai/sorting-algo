package sorting;

public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int minVal, minInd, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			minVal = arr[i];
			minInd = i;
			// j is set to i because we want to compare
			// unsorted elements starting from the right
			// side of the current index
			for (int j = i; j < arr.length; j++) {
				// record minimum value
				if (minVal > arr[j]) {
					minVal = arr[j];
					minInd = j;
				}
			}
			// check if minimum value is at its original position
			// if not, swap their positions
			if (minInd < arr[i]) {
				temp = arr[i];
				arr[i] = arr[minInd];
				arr[minInd] = temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// selection sort gets the minimum value and
		// compares against the remaining right of the array
		
		int[] arr = {5,3,5,2,7,8,10};
		int[] res = selectionSort(arr);
		for (int i : res) System.out.println(i);
	}

}
