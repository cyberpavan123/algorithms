package com;

public class SearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int index = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 27);
		
		int index = binarySearchIteratively(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 27);
		//System.out.println(index);
		
		//int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		int[] sortedArray = { 89, 57, 91, 47, 95, 3, 27, 22, 67, 99 };
	     int key = 27;
	     
	  
	         index = binarySearchIteratively(sortedArray, key);
	        System.out.println("Search element found " + key+ " in location index : " + index);

	}
	
	public static int binarySearch(int arr[], int elementToSearch) {

	    int leftIndex = 0;
	    int rightIndex = arr.length - 1;
	    int middleIndex=0;

	    // termination condition (element isn't present)
	    while(leftIndex <= rightIndex) {
	         middleIndex = (leftIndex + rightIndex) / 2;
	     
	         System.out.println("middleidex is =>"+middleIndex);
	        // if the middle element is smaller
	        // point our index to the middle+1, taking the first half out of consideration
	         if (elementToSearch<arr[middleIndex] )
	         {
	        	 rightIndex = middleIndex - 1;
	         }
	        // if the middle element is bigger
	        // point our index to the middle-1, taking the second half out of consideration
	        else if (elementToSearch>arr[middleIndex])
	        {
	        	leftIndex = middleIndex + 1;
	        }
	         // if the middle element is our goal element, return its index
	        else  {
		            return middleIndex;
		        }

	    }
	    return -1;
	}
	public static int binarySearchIteratively(int[] sortedArray, int key) {
		  int low = 0;
		     int high = sortedArray.length - 1;
		  int index = Integer.MAX_VALUE;

		  while (low <= high) {

		   int mid = (low + high) / 2;

		   if (sortedArray[mid] < key) {
		    low = mid + 1;
		   } else if (sortedArray[mid] > key) {
		    high = mid - 1;
		   } else if (sortedArray[mid] == key) {
		    index = mid;
		    break;
		   }
		  }
		  return index;
		 }

}
