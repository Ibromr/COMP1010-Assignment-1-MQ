package toBeCompleted;

public class ArrayServiceSubmitted {
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the first index at which target exists
	 * in array data, -1 if it doesn't
	 *
	 * return -1 if array is null or empty.
	 */
	public static int indexOf(int[] data, int target) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return -1;
		}
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) { 			//Check each index if the target matches
			if(data[i] == target) {
				return i;
			}
		}
		
		
		
		
		return -1;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the number of times target appears in the array data
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int countOccurrences(int[] data, int target) {
		
		//Null/Empty Check
		if(data == null || data.length ==0) {
			return 0;
		}
		
		
		//Variable Declaration
		int count = 0;
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) {			//Going through each element of array data
			if(data[i] == target) {					//Checking if target appears in array data	
				count++; 
			}
		}
		
		
		
		
		return count;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int max(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration
		int highest = 0;
		boolean first = true; 					//Initialise highest first time
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) {				//Going through each element of array data
			if(first == true || data[i] > highest) {		//Checking for highest in the array data
				highest = data[i];
				first = false;
				}
			}
		
		
		
		
		return highest;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int min(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration
		int smallest = 0;
		boolean first = true; 						//Initialise smallest first time
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) {
			if(first == true || data[i] < smallest) {		//Checking each array element for smallest
				smallest = data[i];
				first = false;
			}
		}
		
		
		
		
		return smallest;
	}

	
	
	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration
		int highest = 0; 
		int lowest = 0;
		boolean firstHighest = true; 					//Initialising highest first time
		boolean firstLowest = true;						//Initialising lowest first time
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) {					//Checking each array element for highest
			if(firstHighest == true || data[i] > highest) {	
				highest = data[i];
				firstHighest = false;
			}
		}
		
		for(int j = 0; j < data.length; j++) {					//Checking each array element for lowest
			if(firstLowest == true || data[j] < lowest) {
				lowest = data[j];
				firstLowest = false;
			}
		}
		
		
		
		
		return highest - lowest;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @return true if array is sorted in ascending order.
	 * EXAMPLE: {10, 10, 15} is in ascending order 
	 * (even though not in STRICTLY ascending order), so the 
	 * function must return true for array {10, 10, 15}	 
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isAscending(int[] data) {
		
		//Null/Empty Check
		if(data == null) {
			return false;
		}
		
		if(data.length <= 1) {
			return true;
		}
		
		
		//Main Algorithm
		for(int i = 1; i < data.length; i++) {
			if(data[i] < data[i-1]) {			//Checking if array is not ascending
				return false;  				
			}
		}
		
		
		
		
		return true;					//returning true if array is ascending
	}
	

	
	/**
	 * 
	 * @param data
	 * @return true if array is sorted in descending order.
	 * EXAMPLE: {10, 10, 5} is in descending order 
	 * (even though not in STRICTLY descending order), so the 
	 * function must return true for array {10, 10, 5}
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isDescending(int[] data) {

		//Null/Empty Check
		if(data == null) {
			return false;
		}
		
		if(data.length <= 1) {
			return true;
		}
		
		//Main Algorithm
		for(int i = 1; i < data.length; i++) {
			if(data[i] > data[i-1]) {			//Checking if array is not descending
				return false;
			}
		}
		
		
		
		
		return true;				//Returning true if array is descending
	}

	

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration
		double sum = 0;
		int count = 0; 		
		
		
		//Main Algorithm
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];					//Summing each element of the array
			count++;								//Counting total number of index's in the array
		}
		
		
		
		
		return sum/count;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @return an ascending order sorted version of data
	 * IMPORTANT: the parameter array itself should NOT be modified
	 *
	 * return null array if array is null
	 * return empty array if array is empty
	 */
	public static int[] sorted(int[] data) {
		
		//Null/Empty Check
		int[] emptyArr = {}; 
		
		if(data == null) {
			return null;
		}
		if(data.length == 0) {
			return emptyArr;
		}
		
		
		//Variable Declaration
		int temp = 0; 
		int[] arr = new int[data.length];			
		
		
		//Main Algorithm
		for(int k = 0; k < data.length; k++) { 
			 arr[k] = data[k]; 							//Instance Copy
		 }
		
		 
		 for (int i = 0; i < data.length; i++) {     
	            for (int j = i+1; j < data.length; j++) {     //Organising each element of Instance Copy in Ascending order
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;
	               }
	            }
		 }
		 
		 
		 
		 
		 return arr;
	}
		
		

	/**
	 * 
	 * @param data
	 * @return the "median" item of the array.
	 * we define median as the item that sits in the middle
	 * when the array is sorted in ascending order.
	 * If the array has an even number of items, use the item to 
	 * the LEFT of the middle parting line.
	 * For example, if the array is {10, 70, 20, 90, 60, 10, 70, 40},
	 * the sorted array is {10, 10, 20, 40, 60, 70, 70, 90}, and the items 
	 * to the left and right of the middle line are 40 and 60.
	 * Thus the function must return 40 in this case.
	 * If the array is {30, 10, 20, 50, 40}, the sorted array is
	 * {10, 20, 30, 40, 50} and the answer is clear: 30
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int median(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration
		int temp = 0; 
		int median = 0;
		
		int[] arr = new int[data.length]; 
		for(int k = 0; k < data.length; k++) { 
			 arr[k] = data[k]; 						//Instance Copy
		 }
		
		
		//Main Algorithm
		 for (int i = 0; i < data.length; i++) {     
	            for (int j = i+1; j < data.length; j++) {     		//Ordering each element of instance copy in ascending order
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;
	               }
	            }
		 }
		 
		 
		 if(arr.length%2 == 0) { 				//Checking if array length is positive
			 median = arr[(arr.length/2)-1];
		 }
		 else {
			 median = arr[(arr.length/2)];
		 }
		 
		 
			 
		 
		 return median;
	}

	

	/**
	 * 
	 * @param data
	 * @return the most common item in the array.
	 * IMPORTANT: in case of tie, return the item that occurs first in the array
	 * 
	 * return 0 if the array is null or empty
	 */
	public static int mostCommonItem(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
		
		
		//Variable Declaration	
		int maximumCount = 0; 
	    int mostFrequent = 0;
	    
	    
	    //Main Algorithm
	    for (int i = 0; i < data.length; i++) {
	    	int count = 0; 
	    	
	    	for(int j = 0; j < data.length; j++) { //Inner For loop to store frequency of common item
	    		if (data[i] == data[j]) {
	    			count++;
	    		}
	    	}
	    	
	    	if (count > maximumCount) { 		//Checking if the current array element is the most frequent
	    		maximumCount = count;
	    		mostFrequent = data[i]; 
	    	}
	    }
	    
	    
	    
	    
	    return mostFrequent;
	}
					
	
	
	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return 0;
		}
	
		
		//Variable Declaration
		int count = 1;
		int highestCount = 1;


		//Main Algorithm
		for(int i = 1; i < data.length; i++) {
			if(data[i] >= data[i-1]) {
				count++;
				if(count > highestCount) { 			//Checking if current sequence is the longest
					highestCount++;	
				}
			}
			else {
				count = 1;							//Resetting variable count if current sequence terminates
			}								
		}
		
		
		
		
		return highestCount;
	}
	
	
	
	/**
	 * HD - 2
	 * @param data
	 * @return the starting index of the longest ascending sequence in the array
	 * in case of tie, return the starting index of the first of the tied sequences
	 * return -1 if array is null or empty.
	 */
	public static int longestAscendingSequenceStart(int[] data) {
		
		//Null/Empty Check
		if(data == null || data.length == 0) {
			return -1;
		}
		
		
		//Variable Declaration
		int count = 1;
		int highestCount = 1;
		int startIndex = 0;
	
		
		//Main Algorithm
		for(int i = 1; i < data.length; i++) {
			if(data[i] >= data[i-1]) {
				count++;
				if(count > highestCount) {				//Checking if current sequence is the longest
					highestCount++;
					startIndex = i-highestCount+1;	//Storing first element index in the longest sequence
				}										
			}										
			else {
				count = 1;
			}
		}
		
		
		
		
		return startIndex;
	}
	
	
	
	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tied sequences
	 * return null if array is null
	 * return empty array if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		
		//Null/Empty Check
		if(data == null) {
			return null;
		}
		
		else if(data.length == 0) {
			return data;
		}
		
		
		//Variable Declaration
		int startingIndex = longestAscendingSequenceStart(data);  //Storing starting index of sequence
		int length = longestAscendingSequenceLength(data); 			//Storing length of longest sequence
		
		int[] returnArray = new int[length]; 
		
		
		//Main Algorithm
		for(int i = 0; i < length; i++) {
			returnArray[i] = data[startingIndex+i]; 	//Creating new array for longest sequence
		}
		
		
		
		
		return returnArray;
	}
}

	