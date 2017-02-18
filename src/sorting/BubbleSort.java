package sorting;

public class BubbleSort {
	public static int[] bubbleSort(int[] arr) {
		int temp = 0 ;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			} 
		}
		return arr;
	}

	public static void main(String[] args) {
		// the larger elements will be "bubbled"
		// to the left
		int[] arr = {5,3,5,2,7,8,10};
		int[] res = bubbleSort(arr);
		for (int i : res) System.out.println(i);
	}

}
