package com.pankaj;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		rightRotation(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }, 5);
		leftRotation(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }, 5);
	}

	public static void rightRotation(int[] arr, int rotationCount) {

		while (rotationCount > 0) {

			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i = i + 1) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			rotationCount--;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void leftRotation(int[] arr, int rotationCount) {

		while (rotationCount > 0) {

			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			rotationCount--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
