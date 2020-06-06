//TIME COMPLEXITY OF THIS IS Theta(logn);
//faster way of searching the value within an array
package algo.search;
public class IterativeBinarySearch {
	
	static int iterativeBinarySearch(int arr[], int x) {
		int l = 0;
		int r = arr.length -1;
		while(l <= r) {
			int m = l + (r -1)/2;
			if(arr[m] == x) {
				return m;
			}else {
				if(arr[m] < x) {
					l = m +1;
				}else {
					r = m - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int x  = 10;
		int result = iterativeBinarySearch(arr, x);
		if(result == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index " + result); 
		}

	}

}
