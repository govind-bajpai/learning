package arrayProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotatedSortedArrayPeakAndSearch {
	//int arr[] = {9,10,1,2,3,4,5,6,7,8,9,9};
	int arr[] = {1,1,1,1,1,1,1,1,1,1};
	public static void main(String args[])throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Please enter size and seach element");
//		String str = br.readLine();
		RotatedSortedArrayPeakAndSearch r = new RotatedSortedArrayPeakAndSearch();
		System.out.println(r.findLCD(24,12));
		
//		int n = Integer.parseInt(str);
//		int search = Integer.parseInt(br.readLine());
//		System.out.println("Please enter"+n+" element to add in array");
//		r.arr = new int[n];
//		for(int i=0 ; i<n ; i++) {
//			r.arr[i] = Integer.parseInt(br.readLine());
//		}
		
	//	int peak = r.findPeakInRotatedSortedArray(r.arr);
		//int min =  r.findMinInRotatedSortedArray(r.arr);
		int min = r.findMin(0, r.arr.length-1);
		//boolean b = r.isElementAppear(r.arr,search);
		
		//System.out.println("Peak Element is :"+peak + " Min is :"+min+" Element  is "+(b==true?"available":"not available"));
		System.out.println("Peak Element is :"+min);
	}

	private int findLCD(int i, int j) {
		if(j==0) {
			return i;
		}else {
			return findLCD(j,i%j);
		}
	}

	private int findMinInRotatedSortedArray(int[] arr2) {
		int length = arr.length;
		int i = 0;
		int mid = (i+length)/2;
		int low = i;
		int high = length-1;
		int minElement = searchMin(low,mid,high);
		return minElement;
	}

//	9 10 1 2 3 4 5 6 7 8
//	
//	1 1 1 1 1 1 1 1 1 10
//	10 1 1 1 1 1 1 1 1 1
//	10 10 10 10 1 10 10 10
//	10 10 10 10 10 10 10 1
//	1 10 10 10 10 10 10 10
//	10 1 2 2 2 2 2 2 2 2 2 
//	2 2 2 2 10 1 2 2 2 2 2 
	
	int count =0;
	private int searchMin(int low, int mid, int high) {
		System.out.println(++count);
		if(mid!=low && mid !=high) {
		if(arr[mid-1] > arr[mid] && arr[mid+1]>=arr[mid])
			return arr[mid];
		}
		if(mid!=low && arr[mid-1] <= arr[mid]) {
			return searchMin(low, (low + mid-1)/2, mid-1);
		}
		if(arr[mid+1] < arr[mid] ) {
			return searchMin(mid+1, (mid+1 +high)/2, high);
		}
		return -1;
	}

	private boolean isElementAppear(int[] arr2, int search) {
		// TODO Auto-generated method stub
		return true;
	}

	private  int findPeakInRotatedSortedArray(int[] arr2) {
		
		return 0;
	}
	
	public int findMin(int low, int high)
    {
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low) {
        	System.out.println(low+"   "+high);
        	return arr[0];
        }
 
        // If there is only one element left
        if (high == low) return arr[low];
 
        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/
 
        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];
 
        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
 
        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return findMin( low, mid-1);
        return findMin( mid+1, high);
    }
	
	

}
