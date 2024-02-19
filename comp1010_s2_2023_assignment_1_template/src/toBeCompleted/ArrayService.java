package toBeCompleted;

public class ArrayService {
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

		if(data == null || data.length == 0 ) { 	//if data is null or empty.
			return -1;
		}

		for(int i=0; i<data.length; i++) {  		//check each index if the target matches
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

		if(data == null || data.length == 0 ) { //if data is null or empty.
			return 0;
		}

		int count = 0; 
		for(int i=0; i<data.length; i++) { // Going through each element of the array data
			if(data[i] == target) { 	  // Checking if target appears in the array data
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

		if(data == null || data.length == 0 ) { //if data is null or empty.
			return 0;
		}

		int highest = 0;  
		boolean firstTime = true; 			// Initialize highest first time
		for(int i=0; i<data.length; i++) {  // Checking for highest in the array data
			if(firstTime || data[i] > highest) {
				highest = data[i];
				firstTime = false;
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
		if(data == null || data.length == 0 ) { //if data is null or empty.
			return 0;
		}

		int smallest = 0;  
		boolean firstTime = true; 			// Initialize highest first time
		for(int i=0; i<data.length; i++) {  // Checking for highest in the array data
			if(firstTime || data[i] < smallest) {
				smallest = data[i];
				firstTime = false;
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
		if(data == null || data.length == 0 ) { //if data is null or empty.
			return 0;
		}

		int difference = max(data) - min(data);

		return difference; //-100 is just a placeholder to satisfy the "contract", to be completed
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
		if(data == null  ) { // if array is null
			return false;
		} else if( data.length == 0 || data.length == 1) { // array is empty or has a single item (vacuous truth).
			return true;
		}
		else {
			for(int i=0; i<data.length-1; i++) { 

				if(data[i]>data[i+1]) { // if it descends, returns false.
					return false;
				}
			}
		}

		return true; 
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
		if(data == null  ) { // if array is null
			return false;
		} else if( data.length == 0 || data.length == 1) { // array is empty or has a single item (vacuous truth).
			return true;
		}
		else {
			for(int i=0; i<data.length-1; i++) { 
					
				if(data[i]<data[i+1]) { // if it is ascending, returns false.
					return false;
				}
			}
		}

		return true; 
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		if(data == null || data.length == 0 ) { //if data is null or empty.
			return 0;
		}
		
		double sumArr = 0;
		int size = data.length;
		for (int i=0; i<data.length; i++) { // Summing each index value
			sumArr += data[i];
				
		}
		
		return sumArr/size; // Calculating average 
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
		if(data == null  ) { 	// if array is null
			return null;
		}
		
		if (data.length == 0) {
	        return new int[0]; // if array is empty, return an empty array
	    }
		
		
		 int[] sortedData = new int[data.length]; // Create an array to store the sorted data

		    for (int i = 0; i < data.length; i++) {
		        int keyValue = data[i];
		        int j = i - 1;

		        while (j >= 0 && sortedData[j] > keyValue) {		
		            sortedData[j + 1] = sortedData[j];
		            j--;
		        }

		        sortedData[j + 1] = keyValue;
		    }

		    return sortedData; // Return the sorted array
		    
		    
		  // !!! THIS IS A LONG WAY!!!
		    
		    /* int[] sortedData = new int[data.length]; // Create a copy of the input array 
		 	for(int idx=0; idx<data.length; idx++) {
		 		sortedData[idx] = data[idx];
		 } 

		 for (int i = 1; i < sortedData.length; i++) {  // Sorting array using the insertion sort method		        
 			 	int keyValue = sortedData[i];
		        int j = i - 1;		       
		        
		        while (j >= 0 && sortedData[j] > keyValue) {
		            sortedData[j + 1] = sortedData[j];
		            j--;
		        }
		        
		        sortedData[j + 1] = keyValue;
		 }
		    
		 return sortedData; // Return the sorted copy  */
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
		if(data == null || data.length == 0) { 		 //If data is null or data length is 0.
			return 0;
		}
		
	/*	for (int i = 0; i < data.length; i++) { 			// Sorting array using the bubble sort method
			for (int j = i + 1; j < data.length; j++) {
				int temp = 0;
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
	*/
		
		int[] sData = sorted(data);
		
		
		if(sData.length%2 == 0) {				// If the array has an even number of items, 
			return sData[(sData.length/2)-1];		//return the LEFT of the middle parting line.
			
		}
		
		return sData[sData.length/2];  	// Returning this because the array has an odd number of items
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
		if(data == null || data.length == 0 ) {			//If data is null or data length is 0.

			return 0;		
		}

		int maxCount = 0;
		int commonElement = 0;
		
		for (int i = 0; i <data.length; i++) {    	// Choosing the element
			int count = 0;		
			for (int j = 0; j<data.length; j++) { 	// Checking if the element is the same in the inner loop and counting
				if (data[i] == data[j])
					count++;
			}

			if (count > maxCount ) {				// Finding the most common item
				maxCount = count;
				commonElement = data[i];
			}
			
		}

		return commonElement; 
	}

	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		
		if (data == null  || data.length == 0) {				// If data is null or data length is 0.
			return 0;
		}

		int count = 1;					
		int highestCount = 1;

	
		for (int i=1; i<data.length; i++) {			
			if (data[i]>=data[i-1]) {
				count++;
				if (count > highestCount) {
					highestCount = count;
				}
			}
			else{
				count = 1;
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
		
		if (data == null  || data.length == 0) {				// If data is null or data length is 0.
			return -1;
		}
		
		
		int count = 1;					
		int highestCount = 1;
		int index = 0;
	
		for (int i=1; i<data.length; i++) {			
			if (data[i]>=data[i-1]) {
				count++;
				if (count > highestCount) {
					highestCount = count;
					index = i-highestCount +1;		// 60, 10, 40, 70, 4, 1, 7, 2, 9, 10
				}
			}
			else{
				count = 1;
			}

		}
		
		return index; //-100 is just a placeholder to satisfy the "contract", to be completed
	}

	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tie 
	 * return empty array if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		
		if (data == null) {
			return null;
		}
		
		else if (data.length == 0) {
			return data;
		}
		/*
		int startingIndex = longestAscendingSequenceStart(data);
		int length = longestAscendingSequenceLength(data);
		int[] returnArray = new int[length]; 
		for(int i= 0; i<length; i++) {
			returnArray[i] =data[startingIndex+i];  
		}
		*/
		
		int count = 1;					
		int highestCount = 1;
		int index = 0;
	
		for (int i=1; i<data.length; i++) {			
			if (data[i]>=data[i-1]) {
				count++;
				if (count > highestCount) {
					highestCount = count;
					index = i-highestCount +1;		
				}
			}
			else{
				count = 1;
			}

		}
		
		int[] returnArray = new int[highestCount];
		
		for (int i=0; i<highestCount; i++) {
			returnArray[i] = data[index+i];
		}
		
		
		return returnArray; //to be completed
	}
}
