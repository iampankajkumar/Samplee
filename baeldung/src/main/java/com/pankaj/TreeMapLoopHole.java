package com.pankaj;

import java.util.TreeMap;

public class TreeMapLoopHole {

	public static void main(String[] args) {

		TreeMap<String, Object> map = new TreeMap<>();

		map.put("1000", new Object());
		map.put("2", new Object());
		System.out.println(map);
	}

	/*
	 * Array rotation with O(n*d)
	 * 
	 */

}
