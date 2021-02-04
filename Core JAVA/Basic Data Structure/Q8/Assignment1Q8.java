package assignment.sEIGHT;

public class Assignment1Q8 {

	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

		BubbleSort bubble = new BubbleSort();
		int[] nArray = bubble.bubbleSort(arr);
		for(int i : nArray) {
		System.out.print(i + " ");
		}

	}

}
