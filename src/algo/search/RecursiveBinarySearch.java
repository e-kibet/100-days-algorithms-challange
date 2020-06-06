//TIME COMPLEXITY OF THIS IS Theta(logn);
//faster way of searching the value within an array
package algo.search;

public class RecursiveBinarySearch {
	
	static int recursiveBinarySearch(int arr[], int l, int r, int x) {
		if(r >= 1) {
			int mid = l + (r - 1)/2;
			
			if(arr[mid] == x) {
				return mid;
			}else {
				
			if(arr[mid] > x) {
				return recursiveBinarySearch(arr, 1, mid -1, x);
			}else {
				return recursiveBinarySearch(arr, mid+1, r, x);
			}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length;
		int x = 10;
		int result = recursiveBinarySearch(arr, 0, n-1, x);
		if(result == 1) {
			 System.out.println("Element not present");
		}else {
			System.out.println("Element found at index " + result); 
		}

	}

}
