package accessModifiers;

import java.util.*;

public class FourthSmallestElement {

	public static int fourthSmallest(Integer[] arr, int s) {
		Arrays.sort(arr);

		return arr[s - 1];
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int s = 4;
		System.out.print("4th smallest element is " + fourthSmallest(arr, s));
	}
}
