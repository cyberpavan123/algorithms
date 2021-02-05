package com;

import java.util.Arrays;

public class SortAlgo {

	public static void main(String[] args) {
		
	   int ar[]= {4,2,34,7,5};
	   insertionSortp(ar);
	}
	
	public static void bubbleSortp(int[] a) {
		boolean sorted = false;
		while(!sorted)
		{
			sorted=true;
	    for(int iCount=0;iCount<a.length-1;iCount++)
	    {
	    	
	    	if( a[iCount]>a[iCount+1])
	    	{
	    		int temp =a[iCount+1];
	    		a[iCount+1]=a[iCount];
	    		a[iCount]=temp;
	    		sorted=false;
	    	}
	    		
	    }
		}
	    System.out.println(Arrays.toString(a));
	}
	public static void insertionSortp(int[] array) {
		
		int key,j;
		//4,2,34,7,5 //2,4,34,7,5
		 for(int i=1;i<array.length;i++)
		    {
			 key = array[i];
			 j=i-1;
			 while(j>=0 && key<array[j])
			 {
								
				array[j+1]=array[j];
				array[j]=key;
				j--;
			 }
			 
		    }
		 System.out.println(Arrays.toString(array));
	}
	
	public static void selectionSort(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        int minId = i;
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = array[i];
	        array[i] = min;
	        array[minId] = temp;
	    }
	}	
	void merge(int[] array, int left, int mid, int right) {
	    // calculating lengths
	    int lengthLeft = mid - left + 1;
	    int lengthRight = right - mid;

	    // creating temporary subarrays
	    int leftArray[] = new int [lengthLeft];
	    int rightArray[] = new int [lengthRight];

	    // copying our sorted subarrays into temporaries
	    for (int i = 0; i < lengthLeft; i++)
	        leftArray[i] = array[left+i];
	    for (int i = 0; i < lengthRight; i++)
	        rightArray[i] = array[mid+i+1];

	    // iterators containing current index of temp subarrays
	    int leftIndex = 0;
	    int rightIndex = 0;

	    // copying from leftArray and rightArray back into array
	    for (int i = left; i < right + 1; i++) {
	        // if there are still uncopied elements in R and L, copy minimum of the two
	        if (leftIndex < lengthLeft && rightIndex < lengthRight) {
	            if (leftArray[leftIndex] < rightArray[rightIndex]) {
	                array[i] = leftArray[leftIndex];
	                leftIndex++;
	            }
	            else {
	                array[i] = rightArray[rightIndex];
	                rightIndex++;
	            }
	        }
	        // if all the elements have been copied from rightArray, copy the rest of leftArray
	        else if (leftIndex < lengthLeft) {
	            array[i] = leftArray[leftIndex];
	            leftIndex++;
	        }
	        // if all the elements have been copied from leftArray, copy the rest of rightArray
	        else if (rightIndex < lengthRight) {
	            array[i] = rightArray[rightIndex];
	            rightIndex++;
	        }
	    }
	}
	public static void mergeSort(int[] array, int left, int right) {
	    if (right <= left) return;
	    int mid = (left+right)/2;
	    mergeSort(array, left, mid);
	    mergeSort(array, mid+1, right);
	  //  merge(array, left, mid, right);
	}
}
