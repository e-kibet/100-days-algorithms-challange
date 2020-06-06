//time complexity is theta(n)
//Linear search is rarely used practically because other search algorithms such as the 
//binary search algorithm and hash tables allow significantly faster searching comparison to Linear search.
package algo.search;

public class LinearSearch {

	static int linearSearch(int arr[], int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };  
	    int x = 11; 
	    int result = linearSearch(arr, x);
	    if(result == -1) {
	    	 System.out.print("Element is not present in array"); 
	    }else {
	    	System.out.print("Element is present at index " + result);
	    }

	}

}
