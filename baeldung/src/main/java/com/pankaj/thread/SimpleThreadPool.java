package com.pankaj.thread;

import java.util.HashMap;
import java.util.Map;

public class SimpleThreadPool {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 20, 10, 20, 3, 0, 12, 15, 16, 48, 12, 789, 12, 12, 10 };
		calculateFrequency(arr, arr.length);
		calculateUsingMap(arr, arr.length);
	}

	private static void calculateFrequency(int arr[], int size) {

		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			System.out.println(arr[i] + "is " + count + " times");
		}
	}

	private static void calculateUsingMap(int arr[], int size) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			int count = map.get(a) == null ? 0 : map.get(a);
			map.put(a, ++count);
		}
		System.out.println(map);

	}
}