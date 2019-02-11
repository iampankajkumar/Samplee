package com.pankaj.arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] array1 = { 12, 13, 14, 15, 16, 17, 18 };
		RotationClass.arrayRotation1(array1, 3);
		int[] array2 = { 12, 13, 14, 15, 16, 17, 18 };
		RotationClass.arrayRotation1(array2, 1);
		int[] array3 = { 12, 13, 14, 15, 16, 17, 18 };
		RotationClass.arrayRotation2(array3, 3);
		int[] array4 = { 12, 13, 14, 15, 16, 17, 18 };
		RotationClass.arrayRotation2(array4, 1);              

	}

	static class RotationClass {
		/*
		 * ArrayRotaion with O(n*d) time.
		 */
		public static void arrayRotation1(int[] arr, int d) {
			for (int i = 0; i < d; i++) {
				int temp = arr[0];
				int j = 0;
				for (j = 0; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}

		/*
		 * ArrayRotation with O(n) time and O(d) space.
		 */
		public static void arrayRotation2(int[] arr, int d) {
			int temp[] = new int[d];
			for (int i = 0; i < d; i++) {
				temp[i] = arr[i];
			}

			int i = 0;
			int a = 0;
			for (i = 0; i < arr.length - d; i++) {
				arr[i] = arr[i + d];
			}

			for (int k = i; k < d; k++) {
				arr[k] = temp[a];
				a++;
			}

			System.out.println(Arrays.toString(arr));
		}
	}
}
