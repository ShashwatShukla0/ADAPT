package assignment.sEIGHT;

public class BubbleSort {
	 public int[] bubbleSort(int arr[]) {
		    int x = arr.length;
		    for(int i = 0; i < x - 1; i++) {
		    for(int j = 0; j < x - i - 1;j++) {
		    int temp = arr[j];
		    if(arr[j] < arr[j+1]) {
		    continue;
		    }else {
		    arr[j]=arr[j+1];
		arr[j+1]=temp;
		    }
		    }
		    }
		   
		    return arr;
		    }

}
