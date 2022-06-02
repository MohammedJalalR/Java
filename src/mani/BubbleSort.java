package mani;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 9, 5, 4, 6, 2 };
		// outer for loop for itteration
		for (int i = 1; i < arr.length; i++)  //i=1    1<5
     	// inner for loop for indexing
		{
			for (int j = 1; j < arr.length; j++) {//j=1  1<5
				
				// Logic for swapping
				
				if (arr[j - 1] > arr[j])//arr[1-1]=0    9>5
                {
					int temp = arr[j - 1]; //9            
					arr[j - 1] = arr[j];  //5
					arr[j] = temp;       
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
