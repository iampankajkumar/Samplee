package com.pankaj.arrays;

public class FindIndexOfLeftRightSum {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 2, 3, 3, 5, 4 };
		System.out.println(findIndex(arr));
	}

	private static int findIndex(int arr[]) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		int leftSum = arr[left];
		int rightSum = arr[right];

		while (left != right) {
			if (leftSum > rightSum)
				rightSum += arr[--right];
			else if (leftSum < rightSum)
				leftSum += arr[++left];
			else {
				if (left + 1 == right - 1) {
					return ++left;
				} else {
					leftSum += arr[++left];
					rightSum += arr[--right];
				}
			}
		}
		return -1;
	}
}
