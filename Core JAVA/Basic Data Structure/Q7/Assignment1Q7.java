package assignment.seven;



public class Assignment1Q7 {
	
	public searchArray(int[] arr,int valueToCheck)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==valueToCheck)
			{
				return i;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	       int valueToCheck = 19;
	         SearchArray searchArray = new SearchArray();
	         boolean s = searchArray.searchArray(arr, valueToCheck);
	         System.out.println(s);

	}

}
